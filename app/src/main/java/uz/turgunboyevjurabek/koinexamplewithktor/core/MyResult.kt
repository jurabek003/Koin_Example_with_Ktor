package uz.turgunboyevjurabek.koinexamplewithktor.core

sealed class MyResult<out R> {
    data class Success<out T>(val data: T) : MyResult<T>()
    data class Error(val exception: Exception) : MyResult<Nothing>()
}