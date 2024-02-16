package com.example.mycoursesapp

import androidx.annotation.DrawableRes

//must contains one primary constructor
data class Courses(
 val rating:Float,
 val title:String,
 @DrawableRes val thumbnail:Int,
 val body:String
)

val course1=Courses(4.5F,"Complete android course with full projects",R.drawable.course1,"What’s Jetpack Compose and Its Advantages over the Imperative way of building Android Apps")
val course2=Courses(3.0F,"Complete flutter course with full projects",R.drawable.course2,"What’s flutter course and Its Advantages over the Imperative way of building Android Apps")
val course3=Courses(3.5F,"Complete kotlin course with full projects",R.drawable.course3,"What’s kotlin course and Its Advantages over the Imperative way of building Android Apps")
val course4=Courses(5.0F,"Complete dsa course with full projects",R.drawable.course4,"What’s dsa course and Its Advantages over the Imperative way of building Android Apps")
val course5=Courses(4.0F,"Complete native course with full projects",R.drawable.course5,"What’s native course and Its Advantages over the Imperative way of building Android Apps")
val allCourses= listOf<Courses>(course1, course2, course3, course4, course5)