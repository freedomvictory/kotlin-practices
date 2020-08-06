package com.easy.example


import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class PackageExampleTest{


    @Test
    fun testWhat(){
        what()
    }

    @Test
    fun testDriveMotoBike(){
        val mb = Motorbike()
        mb.drive()
    }

}

