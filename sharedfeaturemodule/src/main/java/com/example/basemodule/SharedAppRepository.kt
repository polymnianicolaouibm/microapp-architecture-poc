package com.example.basemodule


class SharedAppRepository: SharedAppRepositoryRepresentable{
    private val list = listOf("listItem1", "listItem2", )

    override val listOfData: List<String> = list
}