package com.example.mylibrary.kotlin1110

enum class LicenseStatus {
    UNQUALIFIED,
    LEARNING,
    QUALIFIED;

    var licenseId:String? = null
}

class Driver(var status:LicenseStatus){
    fun checkLicenseStatus():String{
       return when(status){
           LicenseStatus.UNQUALIFIED -> "没资格"
           LicenseStatus.LEARNING -> "在学"
           LicenseStatus.QUALIFIED -> "有资格"
       }
    }
}
