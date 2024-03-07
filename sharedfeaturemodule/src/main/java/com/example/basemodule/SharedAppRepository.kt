package com.example.basemodule

import javax.inject.Singleton

@Singleton
class SharedAppRepository: SharedAppRepositoryRepresentable{
    private val list = listOf("listItem1", "listItem2", )

    override val listOfData: List<String> = list
}