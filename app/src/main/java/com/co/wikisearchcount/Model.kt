package com.co.wikisearchcount

object Model{
    data class Result (val query : Query)
    data class Query (val searchInfo : SearchInfo)
    data class SearchInfo (val totalHits : Int)
}