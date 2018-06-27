Note and general usage of learning Kotlin. Sourced from various texts, blogs and books.
All credit to the respective authors

Pre-requisites
----
Java 8 installed
Kotlin installed locally at `/usr/local/kotlinc`
Alternatively use `brew update ; brew install kotlin`
Add to `~/.bash_profile`

    PATH=$PATH:/usr/local/kotlinc/bin
    export KOTLIN_LIB=/usr/local/kotlinc/lib

Simple compile
----    
CLI: 

    kotlinc HelloWorld.kt
    
Produces: `HelloWorldKt.class`

Run:

    java -cp $KOTLIN_LIB/kotlin-runtime.jar:. HelloWorldKt
    
Don't forget the current dir in the classpath to find your own class.

Simple global function
----
Define in Functions.kt

    fun sumTwoIntegers(a: Int, b: Int):Int {
        return a + b
    }
    
and show the result

    fun main(args: ArrayList<String>) {
        println("Sum of 3 and 5 is ${sumTwoIntegers(3, 5)}")
    }
    
Compile and run:

    $ kotlinc Functions.kt 
    $ java -cp $KOTLIN_LIB/kotlin-runtime.jar:. FunctionsKt
    Sum of 3 and 5 is 8

but notice in the IDE, the method signature and the method call are underlined in red due to Overload conflict, because the .class is generated in the same dir as source, assuming the commands are executed in the src directory.
Delete all .class files and make a separate build directory
    
    $ rm *.class
    $ cd ..; mkdir build
    $ cd build/
    
Compile from source and execute

    $ kotlinc ../src/Functions.kt
    $ java -cp $KOTLIN_LIB/kotlin-runtime.jar:. FunctionsKt
    
The IDE is now clear of errors.

Shorthand version of a one line function:

    fun sumThreeIntegers(a: Int, b: Int, c: Int) = a + b +c
    
    fun main(args: Array<String>) {
        println("Sum of 1 + 2 + 3 is ${sumThreeIntegers(1,2,3)}")
    }
    >>>
    Sum of 1 + 2 + 3 is 6
    
If is an expression not a statement
----

    fun max(a: Int, b: Int): Int = if (a > b) a else b
    
    fun main(args: Array<String>) {
        println("Max of 3 and 5 is ${max(3,5)}")
    }
    >>>
    Max of 3 and 5 is 5
    
Type inference - no return type required in simple function if the compile can refer the result type

    fun max2(a: Int, b: Int) = if (a > b) a else b
    fun main(args: Array<String>) {
        println("Max of 4 and 2 is ${max2(4,2)}")
    }
    >>>
    Max of 4 and 2 is 4
    
Variables
----
`val` for immutables and `var` for mutables. Variables can be type inferenced if initialised with the declaration
    
    val greeting = "hello"
    var accountBalance = 12345.67
    
- a `val` reference is itself immutable and can’t be changed, the object that it points to may be mutable.
- the `var` keyword allows a variable to change its value, its type is fixed

String templates and semi-colons
----
Like Groovy but only use double-quotes. No triple quote multi-line option like Groovy. Split lines with separate strings
Like Groovy semi-colons are not required.

Default Visibility
----
`public` is the default and can be omitted.

Value object classes
----
- Data only, no code classes are Value Objects (VOs)
- Getters and Setters are not required unless customised
- Use `get() = ...` or `get() {...}`

Example: 
- Multiple classes in same file: See `ValueObjects.kt`
- `VOApp` to run example

Packages and Files
----
You can put multiple classes in a file, put package declarations in a file that doesn't match the path.
Files can be named anything and not match classes, etc.
But its better to stick to the Java way and put classes in the same named files in the proper hierarchy.

When vs Switch
----
The `when` statement is a more powerful version of the Java `switch`

Enums
----
Use `enum class` to define. Enum is a *soft keyword*. Special meaning before `class` but can be used elsewhere.
If you define any functions, a semi-colon is required to separate functions from the lists of constants.

