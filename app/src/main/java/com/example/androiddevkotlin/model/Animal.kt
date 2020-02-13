package com.example.androiddevkotlin.model

data class Animal(var name: String, var age: Int, var imageURL: String)

object suppliers {

    var animals = listOf<Animal>(
        Animal(
            "KJjkdbksad",
            23,
            "https://images.unsplash.com/photo-1497752531616-c3afd9760a11?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80"
        ),
        Animal(
            "ksdbkasdb",
            34,
            "https://images.unsplash.com/photo-1484406566174-9da000fda645?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"
        ),
        Animal(
            "ptypert",
            67,
            "https://images.unsplash.com/photo-1581328493669-71ac1ccfbbe6?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80"
        ),
        Animal(
            "qwewqe",
            56,
            "https://images.unsplash.com/photo-1503066211613-c17ebc9daef0?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"
        ),
        Animal(
            "uioiuou",
            56,
            "https://images.unsplash.com/photo-1437622368342-7a3d73a34c8f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60"
        )
    )

}