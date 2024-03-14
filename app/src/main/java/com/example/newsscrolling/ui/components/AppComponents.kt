package com.example.newsscrolling.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.newsscrolling.R
import com.example.newsscrolling.data.entity.Article
import com.example.newsscrolling.ui.theme.Purple40

@Composable
fun Loader(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        CircularProgressIndicator(
            modifier = Modifier
                .size(60.dp)
                .padding(10.dp),
            color = Purple40
        )
    }

}

@Composable
fun NormaTextComposable(text : String){
    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(8.dp),
        text = text,
        style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Normal, fontFamily = FontFamily.Monospace, color = Purple40)
    )
}


@Composable
fun HeadingTextComponent(text: String, centerAligned:Boolean= false){
    Text(modifier = Modifier
        .fillMaxWidth()
        .wrapContentHeight()
        .padding(8.dp),
        text = text,
        style = TextStyle(fontSize = 24.sp, fontWeight = FontWeight.Medium),
        textAlign = if(centerAligned) TextAlign.Center else TextAlign.Start
    )
}

@Composable
fun NewsRowComponent(article: Article){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)
        .background(Color.White)
    )
    {
        AsyncImage(
            modifier = Modifier
                .fillMaxWidth()
                .height(249.dp),
            model = article.urlToImage,
            contentDescription = "",
            contentScale = ContentScale.Crop,
            placeholder = painterResource(id = R.drawable.placeholder_image),
            error = painterResource(id = R.drawable.placeholder_image)
        )
        Spacer(modifier = Modifier.size(20.dp))

        HeadingTextComponent(text = article.title?: "")

        Spacer(modifier = Modifier.size(10.dp))

        NormaTextComposable(text = article.description?: "")

        Spacer(modifier = Modifier.weight(1f))

        AuthorDetailsComponent(article.author, article.source?.name)
    }
}

@Preview(showBackground = true)
@Composable
fun NewsRowComponentPreview(){
    val article = Article(
        author = "Mr auth",
        title = "The TiT",
        null,
        null,
        null,
        null,
        null,
        null
    )
    NewsRowComponent(article = article)
}

@Composable
fun AuthorDetailsComponent(authorName: String?, sourceName: String?){
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 10.dp, end = 10.dp, bottom = 24.dp)
        .background(Color.White)
    )
    {
        authorName?.also{
        Text(text = it)
        }
        sourceName?.also {
        Text(text = it)
        }
    }
}

@Composable
fun EmptyStateComponent(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = painterResource(id = R.drawable.no_news), contentDescription =null )

        HeadingTextComponent(text = stringResource(R.string.no_news_as_of_now_please_check_later))
    }
}

@Preview
@Composable
fun EmptyStateComponentPreview(){
    EmptyStateComponent()
}