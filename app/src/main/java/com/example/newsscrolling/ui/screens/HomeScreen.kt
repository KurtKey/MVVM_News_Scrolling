package com.example.newsscrolling.ui.screens

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.newsscrolling.ui.components.EmptyStateComponent
import com.example.newsscrolling.ui.components.Loader
import com.example.newsscrolling.ui.components.NewsRowComponent
import com.example.newsscrolling.ui.viewmodel.NewsViewModel
import com.example.utilities.ResourceState

const val TAG = "HomeScreen"

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    newsViewModel: NewsViewModel = hiltViewModel()
) {

    val newsRes by newsViewModel.news.collectAsState()


    val pagerState = rememberPagerState(
        initialPage = 0,
        initialPageOffsetFraction = 0f
    ){
        100
    }
    VerticalPager(
        state = pagerState,
        modifier = Modifier.fillMaxSize(),
        pageSize = PageSize.Fill,
        pageSpacing = 8.dp
    ){
        page: Int ->

        when (newsRes) {
            is ResourceState.Loading -> {
                Log.d(TAG, "Inside loading")
                Loader()
            }

            is ResourceState.Success -> {
                val response = (newsRes as ResourceState.Success).data
                Log.d(TAG, "Inside success ${response.status} = ${response.totalResults}")

                if(response.articles.isNotEmpty()) {
                    NewsRowComponent(response.articles.get(page))
                }else{
                    EmptyStateComponent()
                }
            }

            is ResourceState.Error -> {
                val error = (newsRes as ResourceState.Error)
                Log.d(TAG, "Inside error  $error")
            }

            else -> {}
        }
    }

}




@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}