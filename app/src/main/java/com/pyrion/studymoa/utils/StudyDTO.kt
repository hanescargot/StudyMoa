package com.pyrion.studymoa.utils

import com.google.gson.annotations.SerializedName

class StudyDTO(
    @SerializedName(value="imageURL")
    var imgUrl : String,
    @SerializedName(value="studyTitle")
    var title : String,
    @SerializedName(value="contact")
    var contact : String,
    @SerializedName(value="place")
    var address : String,
    @SerializedName(value="studyDescription")
    var description : String
) {

}