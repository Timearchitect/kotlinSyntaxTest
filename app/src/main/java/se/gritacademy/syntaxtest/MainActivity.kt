package se.gritacademy.syntaxtest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    fun test2() {
        Log.d("alrik", "test2: ")
    }

    companion object{ //static
        var defaultColor:String= "#ff00ff" // magenta
    }

    private lateinit var tv:TextView  // private TextView tv;
    public lateinit var x:Any

    fun alrik( para:String = "hejsan" ): Int {
        return 5
    }

    fun merge( vararg array:String ) {
        for ( x in array)
            Log.i("alrik", "loop: "+x)
    }

    // int alrik( String para){
    //      para="hejsan"
    //      return 5
    // }


    override fun onCreate(savedInstanceState: Bundle?) {



        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var b: Button = findViewById(R.id.button)
        b.setOnClickListener( {
            var i: Intent = Intent(this,MainActivity2::class.java)
            // Intent i = new Intent (this, MainActivity2.class)
            startActivity(i)
        }  )

        //tv= findViewById(R.id.text)
        tv = findViewById<TextView>(R.id.text)
        x = findViewById<TextView>(R.id.text)
        //variabler
        var foo = 1
        var bar:Int = 5  // datatypen
        var longTal:Long = 1232154856445645645L
        var foo2:String = "hejsan"
        var decimalTal: Float = 0.5f // float decimalTal = 0.5f
        var doubleTal:Double = 0.100000000000001
        var c:Char = 'c'
        var bool:Boolean = false

        var x :Any = arrayOf("h","yo","Alriks bästa skibidi")

        val CONST_VALUE:Int=1337  // final int CONST_VALUE=1337

      // int y = 5, z = 5;
        var y:Int= 5; var z:Int= 5;

        var ia:IntArray = IntArray(5)          //
        var ia2:IntArray = intArrayOf(1,2,3,4,5,6) //
        var ba:BooleanArray = BooleanArray(5)
        var ba2:BooleanArray = booleanArrayOf(true,false)

        var sa:Array<String> = arrayOf<String>("hej,tjena")

        if( 1 === 1 ){ //som js
            Log.d("alrik", "YO")
        }else
            Log.d("alrik", "NO")

        //  (x<=10)
        //Log.d("alrik", (1==1)? "hej":"nej" )
        Log.d("alrik", if(1==1) "hej" else "nej" )

        when (foo){
            1 -> {
                Log.d("alrik", "when: 1")
            }
            2->Log.d("alrik", "when: 2")
            3->Log.d("alrik", "when: 3")
            else -> Log.i("alrik", "when: else")
        }

        var s3:String= ""
        Log.d("alrik", if(s3==="") "YES" else "NO")

        var i = 0
        while ( i < 10 )
        {
            Log.d("alrik", "while ${ i } loops")
            //Log.d("alrik", "while "+ i +" loops")
            /*
            i=i+1
            i+=1
            */
            i++
        }

        var s4:Array<String> = arrayOf("hej","he","yo") //generic
        for (x in s4)
            Log.i("alrik", "foreach: "+ x)

        for ( i in 0..10 )  // for (int i = 0; i <= 10 ; i++)
            Log.i("alrik", "range: "+ i)

        for ( i in 0..10 step 2) // for (int i = 0; i <= 10 ; i+=2)
            Log.i("alrik", "range: "+ i)

        for ( i in 10 downTo  0) // for (int i = 0; i <= 10 ; i+=2)
            Log.i("alrik", "range reverse: "+ i)

        merge("hej","san","alrik")

        var h:Human = Human("Alrik")


        // Human h = new Human("Alrik");
        var x2:Any =  findViewById(R.id.text) as TextView  // den vet att det är en textView
        var x3:Any =  findViewById<TextView>(R.id.text) // den vet att det är en textView
        Log.i("alrik", "is h a Human?: " + (h is Human).toString() )

        // extended stuff

        var s:String? = "hej"
        h.name="Alrik"
        Log.i("alrik", h.name)

        fun String.log(){
            Toast.makeText(baseContext, this, Toast.LENGTH_LONG).show()
        }

        fun String.addMore()= this+" TOALETT!!!!!"

        Log.i("alrik", "is Human an AI?: "+(h is AI).toString())

        "SKIBIDI BAPP".addMore().log() //extra funktioner i Klass


        Log.i("alrik", "onCreate: "+s!!.length)
        `Void int Int`() //custom funktionsnamn


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun `Void int Int` (){ //custom funktionsnamn
        Log.i("alrik", "YO det funkar med custom name")
    }


}