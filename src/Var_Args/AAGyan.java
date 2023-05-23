/*
 * JVM -> it is a specification which provides an execution environment where java programs are being executed. 
 * 		  it loads/verifies/executes the code. it is platform dependent.
 * 		  
 * JRE-> JVM + set of libraries + other related files. it is implementation of JVM which is used to provide RTE.
 * 
 * JDK-> JRE + development tools. it is a s/w development environment where java applications are developed. e.g. Java SE/ME/EE
 */

/*
 * JVM architecture- It contains classloader, memory area, execution engine etc.
 * 
 * 1) Classloader
 * 
		Classloader is a subsystem of JVM which is used to load class files. Whenever we run the java program, it is loaded 
		first by the classloader. There are three built-in classloaders in Java.

		a)Bootstrap ClassLoader: This is the first classloader which is the super class of Extension classloader. 
			It loads the rt.jar file which contains all class files of Java Standard Edition like java.lang package classes, 
			java.net package classes, java.util package classes, java.io package classes, java.sql package classes etc.
		
		b)Extension ClassLoader: This is the child classloader of Bootstrap and parent classloader of System classloader. 
			It loades the jar files located inside $JAVA_HOME/jre/lib/ext directory.
			
		c)System/Application ClassLoader: This is the child classloader of Extension classloader. It loads the classfiles from 
			classpath. By default, classpath is set to current directory. You can change the classpath using "-cp" or 
			"-classpath" switch. It is also known as Application classloader.
	
	2) Memory area
	
		a)Class(Method) Area: Class(Method) Area stores per-class structures such as the runtime constant pool, field and 
			method data, the code for methods.

	 	b)Heap: It is the runtime data area in which objects are allocated.

 		c)Stack: Java Stack stores frames. It holds local variables and partial results, and plays a part in method invocation 
			and return. Each thread has a private JVM stack, created at the same time as thread. A new frame is created each 
			time a method is invoked. A frame is destroyed when its method invocation completes.

 		d)Program Counter Register: PC (program counter) register contains the address of the Java virtual machine instruction 
			currently being executed.

 		e)Native Method Stack: It contains all the native methods used in the application.
 		
 	3) Execution Engine

		a)A virtual processor
		
		b)Interpreter: Read bytecode stream then execute the instructions.
		
		c)Just-In-Time(JIT) compiler: It is used to improve the performance. JIT compiles parts of the byte code that have
		  	similar functionality at the same time, and hence reduces the amount of time needed for compilation. Here, the 
		  	term "compiler" refers to a translator from the instruction set of a Java virtual machine (JVM) to the instruction
		  	set of a specific CPU.
		  	
	4) Java Native Interface: Java Native Interface (JNI) is a framework which provides an interface to communicate with 
			another application written in another language like C, C++, Assembly etc. Java uses JNI framework to send output 
			to the Console or interact with OS libraries.
 */

// print/println methods are of PrintStream class and are called on static member 'out' of 'System' class which is a final class.
// A class cannot be private.
// passing array size as negative will give runtime error and decimal size will lead to compile time error.
	
/* Always use equals method to compare non-primitive data types like string, arrays etc. */

/*	Modifier      Package  Subclass  World

	public          Yes      Yes     Yes

	protected       Yes      Yes     No

	Default (no
	modifier)       Yes       No     No

	private         No        No     No
*/
	// An object is given a memory space where a reference variable is not given a memory space.
	// this keyword is used to differentiate b/w local and class variables.
	// new keyword is used to instantiate an object of a class.
	// A virtual function is an inheritable and overridable function.
	
	//constructor chaining
	
	/* Constructor chaining is a concept which is used to perform multiple tasks using multiple constructor rather than
	 * creating code for each task in a single constructor. we create a separate constructor for each task and then
	 * create a chain of constructors to make the program more readable.
	 * this is achieved by two ways Using this for same class and by Using super for subclass
	 * when we use super then certain type of chaining ensures that creation of sub class's object starts with the initialization of 
	 * super class's data members. */
	
	// singleton class
	
	/* private constructors can be created and one of the objective for the same is to create singleton class.
	 * a singleton class is class for which at most one object for the class can be created this concept is used in networking and
	 * database connectivity.
	 * usually default constructors are by default public hence they are being made private for singleton classes.
	 * there are 3 steps to create a singleton class->
	 * 	1. create a static object of that class inside the class.
	 *	2. create a private default constructor.
	 *	3. create a static method which will return object of the singleton class. */
	
	// Class and objects
	
	/* Class is a user-defined blueprint from which objects are being created. a class represents set of properties for same type of
	 * objects.
	 * 
	 * Fields are the variables and methods are used to implement behavior of the objects.
	 * 
	 * An object is a real world entity which has following properties:
	 * 	identity: name of the object
	 * 	state: attributes of the object
	 * 	behavior: represented by methods of the class
	 * 
	 * instantiating an object means declaring an object and initializing an object means providing storage space in the memory.
	 * 
	 * All classes have a constructor by default and if they lack of it then java compiler creates a default constructor for a 
	 * class which calls the ObjectClass constructor if the class has no parent class. It calls ParentClass constructor i.e. 
	 * super(); if there exists a parent class.
	 * 
	 * to create a clone/copy of an object we can use clone() method such as:
	 * 	Test t1=new Test();
	 * 	Test t2=(Test)t1.clone();
	 */
	
	 //Serialization and Deserialization in Java
	
	 /* Serialization is process of converting an object into byte stream and reverse process is called Deserialization. 
	 * This concept is used to travel an object over a network using technologies like RMI.
	 * 
	 * The created byte stream is platform independent so an object can be serialized in one platform and deserialized in another 
	 * platform.
	 * 
	 * readObject() method of ObjectInputStream class is used for deserialization and writeObject() method of ObjectOutputStream class 
	 * is used for serialization
	 * 
	 * only those objects can be serialized for which the class has implemented java.io.Serializable interface.
	 * only non-static members can be serialized, this is not true for static methods because static members belong to the class
	 * 	and not to the object of the class so it does not make any sense to serialize them (the value of static variables may
	 * 	get corrupt upon serialization) 
	 * if parent class has implemented serialized interface then child does not have to implement it but vice versa is not true.
	 */
	
	 //Anonymous Object
	
	 /* Anonymous object: The objects which is instantiated but not stored in a reference variable. they are used for method calling 
	  * and as soon as the call finishes the object is destroyed. they are mostly used by different libraries 
	  * for e.g. AWT to perform some action on capturing an event.  
	 */
	
	// Inheritance
	
	/* Is-A relationship is used to represent inheritance in Java.
	 * 
	 * In inheritance always sub-class's object is created.
	 * 
	 * In the object of subclass, the methods and fields(public, protected) of superclass is saved.
	 * 
	 * Java supports single, multilevel, hierarchical inheritance using classes and multiple, hybrid(mix of two or more type of 
	 * inheritance) inheritance is supported by using interfaces.
	 * 
	 * Except Object class all other classes have only one direct superclass. in the absence of explicit superclass the class is 
	 * subclass of Object class implicitly.
	 * 
	 * Constructors of a superclass can not be inherited as they are not members of a class.
	 */
	
	// Encapsulation
	/*
	 * means binding data and members together.
	 * 
	 * Advantages of encapsulation-> reusability, increased flexibility, data hiding, testing of code is easy
	 */
	
	// Polymorphism-> One interface multiple methods
	/*
	 * many forms, a simple example from real life is a person who goes from different roles throughout his life like son, 
	 * husband, father
	 * 
	 * Two types-> Compile time(achieved by method overloading does not support operator overloading), 
	 * 			   Runtime(achieved by method overriding and also known as dynamic method dispatch)
	 * 
	 * Method overloading-> using different type of parameters and using different number of parameters.
	 * 	
	 * 	1. we dont have to create and remember different names of the functions doing the same thing for e.g. sum(), sum2(), sum3()
	 * 	2. if exact prototype does not match with the arguments then compiler does type conversion.
	 * 	3. we can not overload by return type it will show a compile time error "duplicate method". however it is possible where
	 * 	   data type of the function being called is explicitly specified.
	 * 	4. we can overload static methods.
	 * 	5. we can not overload methods which differ only by static.
	 * 	6. main() can also be overloaded.
	 * 
	 * 	operator overloading is not supported in Java because internally Java overloads operator for e.g. + is overloaded for 
	 * 	concat. 
	 * 
	 * Method overriding-> occurs when a derived class has the definition of a method of superclass. The method of superclass is said to
	 * be overridden. It means that, call to a overridden method is resolved during runtime. 
	 * 
	 * private, final and static methods can not be overridden.
	 * overriding method should have same return type or same sub type. Method signature (access specifier too) should be same.
	 * 
	 * Overriding and exception handling->
	 * 
	 * 	Rule-1:	if super class overridden method does not throw an exception then subclass overriding method can only throw 
	 * 			unchecked exception. throwing checked exception will lead to compile time error
	 *  
	 *  Rule-2:	if super class overridden method throws an exception then subclass overriding method can only throw the sub class
	 *   exception, same exception can not be throw. but throwing a parent class exception will lead to compile time 
	 *   error. for example if super class is throwing RuntimeException then subclass can not throw an exception belongs to Exception
	 *   class as Exception is the super class of RuntimeException. if super class is throwing RuntimeException then subclass can throw
	 *   ArithmeticException as this exception is the sub class of RuntimeException.
	 *   
	 * 
	 * Dynamic method dispatch-> Superclass's reference variable is created then this reference variable is assigned with the objects of
	 * super as well as sub class at overridden method(only) call during runtime.
	 * 
	 * 	At runtime it depends upon the type of object being referred to using superclass reference variable and this determines which 
	 * 	version of an overridden method will be executed.
	 * 
	 *  Upcasting is the process of referring a subclass object using superclass reference variable. Java uses this fact to resolve 
	 *  calls to overridden methods at runtime.
	 *  
	 *  Static binding (means/refers execution of a program where the type of object is known/determined during compile time) is done during 
	 *  compile-time while dynamic binding is done during run-time.
	 *  
	 *  private, final and static methods and variables uses static binding and bonded by the compiler while overridden methods 
	 *  are bonded during runtime.
	 *  
	 */
	
	// Abstraction
	/*
	 * It means that only necessary details are displayed to the user e.g. car where components are not visible and the interface 
	 * such are steering wheel, controls, breaks, accelerator are visible.
	 * 
	 * Also known as identifying only necessary details of an object and ignoring the irrelevant details.
	 * 
	 * In Java abstraction is achieved by abstract classes and interfaces. 100% abstraction is achieved by interfaces.
	 * 
	 * Abstract classes and methods->
	 * 
	 * 	1. an abstract class is a class which is declared using abstract keyword.
	 * 	2. abstract method is a method which is declared without implementation.
	 * 	3. an abstract class may or may not have all the abstract methods some of them can be concrete methods.
	 * 	4. a method defined abstract must always be redefined in subclass by overriding or by making the sub class as abstract
	 * 	5. Abstract class cannot be instantiated directly using new keyword. (but we can create reference variable of abs class)
	 * 	6. an abstract class can have parameterized and default constructors.
	 * 	7. abstract class can have static, final methods in them.
	 * 
	 * There are situations where we need to define a superclass that declares the structure of given abstraction without complete
	 * implementation of every method. e.g. shape class example
	 * 
	 * Encapsulation means information hiding and Abstraction means implementation hiding.
	 * 
	 * Advantages->
	 * 
	 * 	1. helps in increasing security of an application or program as only necessary details are provided
	 * 	2. reduces complexity
	 * 	3. avoids duplication and increases reusability.
	 */
	
	// Exception handling
	/*
	 * An unwanted event which happens during execution of a program.
	 * 
	 * An error is a serious problem which a program can not catch.
	 * 
	 * All exceptions and errors are sub classes of Throwable(sub class of Object). One branch of Throwable is Exception and another 
	 * is Error.
	 * 
	 * procedure of handling an exception(by default)->
	 * 
	 * 		when an exception occurs then an object of Exception class is created which contains name, description of exception and 
	 * 		current state of the program. this object is then handed over to JVM. creating an object and handing it to the JVM is known
	 * 		as Throwing an exception. System generated exceptions are thrown by JRE.
	 * 
	 * procedure of handling an exception(customized handling)->
	 * 
	 * 		using keywords such as try, catch, finally, throw, throws. the exception is raised in try block and thrown, then catch block
	 * 		catches the exception, irrespective of exception is thrown or not finally block is always executed, if a method is throwing 
	 * 		an exception then the method must be specified by a throws(used to specify an exception) clause, to manually 
	 * 		throw an exception we use throw keyword.
	 * 
	 * There are two types of exceptions: built-in and user-defined
	 * 
	 * 		built-in-> ArrayIndexOutOfBound, StringIndexOutOfBound, ClassNotFound, NullPointerException, RuntimeException, FileNotFound,
	 * 					InterruptedException, IOException, NoSuchClassException, NoSuchMethodException
	 * 
	 * 		user-defined-> an exception need to be created which should extend Exception class. an object will be created of this class
	 * 						and using throw keyword it will be thrown so that catch block will catch the exception.
	 * 
	 * Checked and unchecked exception->
	 * 
	 * 		Checked: 	exceptions that are checked during compile time. if a method throws a checked exception then the method either
	 * 					has to handle such exception or must specify the exception using throws keyword.
	 * 					e.g. ClassNotFound, SQLException, IOException
	 * 
	 * 		Unchecked: 	that are handled during runtime. in c++ all the exceptions are unchecked. in Java exceptions under Error and
	 * 					RuntimeException are unchecked and everything else under Throwable is checked.
	 * 					e.g. ArithmeticException, IndexOutOfBoundException, NullPointerException, NumberFormatException
	 * 
	 * 		Error: 		e.g. OutOfMemoryError, StackOverflowError, VirtualMachineError
	 * 
	 * if a client can recover from an exception then make it checked and the client can not do anything to recover from an
	 * exception then make it unchecked.
	 * 
	 * throw and throws->
	 * 
	 * 		throw: 	if a method or any block of code wants to throw an exception then we can make use of throw keyword.
	 * 				"syntax: throw Instance"  the instance must be type of Throwable class.
	 * 
	 * 		throws: keyword is used in the signature of a method which indicates that the method might throw one of the listed type of 
	 * 				exceptions. if there is a chance of raising an exception then we should handle that checked exception using throws
	 * 				otherwise there will be a compile time error saying UnreportedExceptionXXX must be caught or declared to be thrown.
	 * 
	 * 		it is used to warn the compiler about the possible exceptions and using this in a program does not prevent the abnormal
	 * 		execution of the program.
	 * 
	 * 		it is meaningless for unchecked exceptions.
	 * 
	 * 1. we can not write a catch/finally before specifying try block (catch/finally must follow a try block).
	 * 2. we can not write only try block as it will show a compile time error i.e. try must be followed by a catch/finally.
	 */
	
	// Interfaces
	/*
	 * An interface is like a class which has its fields and methods but the methods are abstract by default.
	 * 
	 * Interfaces specify what a class must do and not how to do.
	 * 
	 * Interface can be regarded as blueprint of a class.
	 * 
	 * Interface members can only be public.
	 * 
	 * If a class implements an interface then the class has to provide body to all the methods of the interface and if not then the 
	 * class must be declared as abstract.
	 * 
	 * can not create constructor inside interface.
	 * 
	 * It is used for total abstraction.
	 * 
	 * All the methods declared are public and all the field are public, static, final by default
	 * 
	 * Used to achieve loose coupling and multiple inheritance.
	 * 
	 *		 New features in JDk8-> we can provide implementation to the method of an interface and this will not affect the intention
	 *								behind interfaces.
	 *
	 *								we can declare static methods in an interface so no object creation is required for calling them.
	 *
	 *		 New features in JDk9-> interface can contain static, private, private static methods.
	 *
	 *	Member/Nested interface->
	 *
	 *		An interface declared inside a class or an interface as a member is known as nested interface.
	 *
	 *		Interface in general are public or default but an interface within a class can be default, protected or public and can not be
	 *		private.
	 *
	 *		To implement a nested interface which is a member of a class we use "Class class_name implements class_name.interface_name"
	 *
	 *		If an interface is a member of an interface then the member one can only be public and changing the modifier will lead to
	 *			compile time error.
	 *
	 *		To implement a nested interface which is a member of an interface we use 
	 *			"Class class_name implements interface_name.interface_name"
	 *	
	 *	Marker interface->
	 *
	 *		An interface which does not contain any fields and methods is known as marker interface.
	 *		Clonnable (java.lang), Serializable (java.io), Remote (java.rmi) are some of the examples of marker interfaces.
	 *
	 *	"An abstract class can provide implementation of an interface but vice versa is not true."
	 *
	 * Functional interface-> is an interface that contain only one abstract method but it can have multiple default methods.
	 *		@FunctionalInterface annotation is used to make sure that an interface should not have more then one abstract method.
	 *		java.util.Function package contains many functional interfaces.
	 *		Runnable, Comparable, ActionListener are some of the examples of functional interfaces.
	 *
	 * Comparator interface->
	 * 
	 *		Comparator interface is used to order the objects of user defined classes. A comparator object is capable of comparing two
	 *		objects of different classes.
	 *
	 *		This interface is present in java.util package and has two main functions such as compare(Object ob1, Object ob2), 
	 *		equals(Object ob). using comparator we can we can sort the elements based to data members.
	 *
	 *		for comparing integers use compare() and for strings use compareTo() method	
	 */
	
	// Multithreading
	/*
	 * It is concept of executing multiple parts of a program consecutively for maximum CPU utilization.
	 * Each part is called a thread.
	 * 
	 * A thread is a light weight process and each thread is independent in nature.
	 * 
	 * Achieved by two methods: 1. extending Thread class 2. implementing Runnable interface (for this method we create object of Thread
	 * 		class and then an object of the class which has implemented the Runnable is passed inside it)
	 * 
	 * A thread begins its life cycle inside run() method. we override the run() method.
	 * 
	 * States of a thread (thread life cycle)-> new, runnable, blocked, waiting, timed waiting, terminated.
	 * 		new-> when a thread object is created (using new keyword)
	 * 		runnable-> This can also be called as active state (running/runnable state). when a thread is ready to being its 
	 * 					execution, it is said to be in runnable state.
	 * 		blocked-> when a thread tries to access a protected part of the code which is currently locked by another thread.
	 * 		waiting-> when a thread is waiting for some I/O operation to happen.
	 * 		timed waiting-> when we call sleep() method.
	 * 		terminated-> when any error occurs or a thread finished execution. 
	 *
	 * 
	 * When our program starts execution a Main thread is created automatically. Default priority of main thread is 5
	 * 
	 * Relation b/w main() and main thread->
	 * 
	 * 		for each program main thread is created by JVM. the main thread first verifies the existence of main(), and then it 
	 * 		initializes the class.
	 * 
	 * There are 3 static variables inside thread class for priority-> MAX_PIRORITY : 10, MIN_PRIORITY : 1, NORM_PRIORITY : 5
	 * 		public final void setPriority(int newPriority);  public final int getPriority(); are methods to handle priority
	 * 
	 * Need for Synchronization->
	 * 
	 * 		there may be sometime when multiple threads try to access same resources hence they produce erroneous results.
	 * 		A synchronized block in java is synchronized on some object. only one thread per object is allowed to access this block and
	 * 		all other threads are blocked until thread inside the block has executed.
	 * 
	 * join() -> this method will put the current thread/s on wait until the thread on which it is called is dead.
	 * 
	 * Deamon thread is a low priority thread which is a service thread i.e. it provides services to other threads. It is dead
	 * 	as soon as the task is finished.
	 */
	
	// finalization and finalize()
	/*
	 * sometimes an object need to perform some action before it is being destroyed for example if the object is holding a resource
	 * then it need to release that resource. to handle such situation java provides a mechanism called finalization. by using
	 * finalization we can define specific actions when an object is about to be reclaimed by garbage collector.
	 * Syntax:   protected void finalize()  we used protected modifier to prevent the outside code to access finalize.  
	 */
	
	// Static and final
	/*
	 * 		static-> static variables are initialized only once when class is loaded into memory.
	 * 
	 * 				 static methods can only-> call other static methods, must only access static data, they can not refer to this or
	 * 					super in anyway.
	 * 					
	 * 				 static block-> Syntax: static { //body of the block }
	 * 								static block is executed before main() method and even before the constructors.
	 * 								it is executed only once when the class is loaded into memory.
	 * 
	 * 		final-> variables are constant, methods and class can not be inherited.
	 */
	
	// Auto-boxing and Auto-unboxing
	/*
	 * converting primitive data type into objects in called auto-boxing and vice versa is known as auto-unboxing.
	 */
	
	// Framework-> a framework is a set of classes and interfaces which provide ready made architecture.
	
	// Package
	/*
	 * A java package is a group of similar type of classes, interfaces and sub-packages.
	 * 
	 * Creating a package (packDemo) using command line->
	 
	  package packDemo;
		class Demopack {
 			public static void main(String[] arg) {
  				System.out.println("hello, i've  created a packeage called packDemo");
 			}
		}
		
		1. save the above file using name Demopack.java
		2. in command line go to the directory which has Demopack file.
		3. write the following command-> javac -d directory_path_of_Demopack_file/classpath Demopack.java
		4. step-3 will create a folder named packDemo (the package itself) and inside this, a class file of Demopack will 
		   be created.
		5. To run that file write the command-> java packDemo.Demopack 
	 */

/*
 * Strings are stored in two places 1.string pool 2.heap.
 * 	pool does memory caching for better optimization. whenever a string is created using literal then first the compiler 
 *  checks whether the string is already present in the pool area if it is there then instead of creating a new string the 
 *  compiler assigns the already present value to the variable (reuse). it is recommended to use literals over using new 
 *  keyword for string creation. When we use new keyword for string creation then the variable is stored in heap area and a 
 *  copy is being created in the pool area too if the string (which is being created using new keyword) is not present in the 
 *  pool area. Strings are called immutable which means once they are created we can not alter its state or contents. 
 *  e.g. String str1="Sudipto"; str1="Pal" in this example a string named str1="sudipto" is created and later "pal" is being 
 *  assigned to it so it does not mean that when "pal" is assigned "sudipto" is deleted from memory. the string "sudipto" is 
 *  still present in the memory its just that a new string named "pal" is created and str1 is now referring to "pal". the 
 *  string "sudipto" will be collected by garbage collector later by the JVM.
*/