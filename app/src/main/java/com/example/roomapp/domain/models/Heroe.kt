package com.example.roomapp.domain.models

import android.media.Image
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "heroe")

data class Heroe(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name :String,
    val image: String
){
    companion object{
        val heroes = listOf<Heroe>(
            Heroe(1, "Spiderman","https://cdn.pixabay.com/photo/2023/02/24/07/40/spiderman-7810368_960_720.png"),
            Heroe(2,"IronMan", "https://pngimg.com/d/ironman_PNG37.png"),
            Heroe(3, "Black Panther","https://pngfre.com/wp-content/uploads/Black-Panther-23-968x1024.png"),
            Heroe(4, "Thor","https://www.pngall.com/wp-content/uploads/2016/04/Thor-PNG-Picture.png"),
            Heroe(5, "Dr Strange","https://i.pinimg.com/originals/2c/b4/72/2cb4727f85db00e737c69a043e32afd5.png"),
            Heroe(6, "Batman","https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/8e4c3336-0621-4c1d-ad77-dee35d7a12d2/dd0uqo9-8a046c11-e93d-4007-a586-5e078a252b41.png/v1/fill/w_1280,h_1397/batman_png_by_arkhamanger_dd0uqo9-fullview.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTM5NyIsInBhdGgiOiJcL2ZcLzhlNGMzMzM2LTA2MjEtNGMxZC1hZDc3LWRlZTM1ZDdhMTJkMlwvZGQwdXFvOS04YTA0NmMxMS1lOTNkLTQwMDctYTU4Ni01ZTA3OGEyNTJiNDEucG5nIiwid2lkdGgiOiI8PTEyODAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.RKtZ7cdmmQUPaW1S1AQr4_qRmFMH-y5EqpfuIsbrlOA"),
            Heroe(7,"Superman", "https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/c92b1cb3-0580-489f-8a32-ff0a3571b156/dfer1lb-145ad4f9-34a2-4982-a206-d7758e6ffc12.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcL2M5MmIxY2IzLTA1ODAtNDg5Zi04YTMyLWZmMGEzNTcxYjE1NlwvZGZlcjFsYi0xNDVhZDRmOS0zNGEyLTQ5ODItYTIwNi1kNzc1OGU2ZmZjMTIucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.zinFVq7f1k6JjfDR43Wdn0O82f-4pNlzz1gjTkyEvF8"),
            Heroe(8, "Flash","https://i.pinimg.com/originals/a2/02/da/a202da2880c237b620012bb8bb2efde8.png"),
            Heroe(9, "Green Lantern","https://www.pngall.com/wp-content/uploads/10/Green-Lantern-PNG-Images-HD.png"),
            Heroe(10, "Robin","https://w7.pngwing.com/pngs/68/587/png-transparent-robin-illustration-robin-batman-nightwing-superhero-superhero-robin-new-marvel-fictional-character-thumbnail.png"),
        )
    }
}


