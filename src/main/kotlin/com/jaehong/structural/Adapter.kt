package com.jaehong.structural

interface MediaPlayer {
    fun play(file: String)
}

interface MediaPackage {
    fun playFile(file: String)
}

class MP3 : MediaPlayer {
    override fun play(file: String) {
        println("Playing MP3 $file")
    }
}

class MP4 : MediaPackage {
    override fun playFile(file: String) {
        println("Playing MP4 $file")
    }
}

class FormatAdapter(private val media: MediaPackage) : MediaPlayer {
    override fun play(file: String) {
        println("Using Adapter : ${media.playFile(file)}")
    }
}

fun main() {
    var player: MediaPlayer = MP3()
    player.play("song.mp3")

    player = FormatAdapter(MP4())
    player.play("song.mp4")
}