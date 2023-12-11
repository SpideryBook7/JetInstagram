package com.vipulasri.jetinstagram.model

data class Post(
  val id: Int,
  val image: String,
  val user: User,
  val isLiked: Boolean = false,
  val likesCount: Int,
  val commentsCount: Int,
  val timeStamp: Long
)

data class Story(
  val image: String,
  val name: String,
  val isSeen: Boolean = false
)

val names = arrayOf(
    "Spider",
    "Jack",
    "Opaca",
    "Show",
    "dark_you",
    "beltran",
    "Shein",
    "Mclovin",
    "phillsohn",
    "deitch"
)