package se.gritacademy.syntaxtest

open class Human : Animal,AI {
    private  var age:Int = 0
        get(){
            return field
        }
        set(value) {
            field = value
        }
    var name:String // kan vara null
        get() {
            return "!"+field
        }
        set(value) {
            field = value + "!"
        }

    // setName(String newName){ this.name= newName; }
    constructor(name: String) {
        this.name = name
    }

    override var prompt: String = "Cute"
        get() = field
        set(value) { field = value}

    /*   override var prompt: String = "cute"
           get() =  field
           set(value) { field = value }*/
}