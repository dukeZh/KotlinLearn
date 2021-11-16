package com.example.mylibrary.kotlin1115

//vararg 可变参数
class MagicBox7<T : Human7> {

    //产生一个Man 类型得对象，如果不是指定类型的对象，就通过backup函数生成一个指定函数得对象
/*    fun <T> randomOrBackup(backup:()->T): T {
        val items = listOf(
            Boy7("jack",20),
            Man7("John",35)
        )
        val random = items.shuffled().first()
        return if (random is T){
            random
        }else{
            backup()
        }
    }*/

   inline fun <reified T> randomOrBackup(backup: () -> T, items: List<Human7>): T {
        val random = items.shuffled().first()
        return if (random is T) {
            random
        } else {
            backup()
        }
    }
}

open class Human7(val age: Int)
class Boy7(val name: String, age: Int) : Human7(age){
    override fun toString(): String {
        return "Boy7(name='$name',age='$age')"
    }
}
class Man7(val name: String, age: Int) : Human7(age){
    override fun toString(): String {
        return "Man7(name='$name',name='$age)"
    }
}



