package ExceptionHandling;

/*
    This is a user defined exception which extends main exception class
This is mainly used to throw user defined statements for exceptions like i should not be zero
or age should not be less than 18 in this case throw plays a role in it.

We need to create a exception using throw keyword

    throw new NotZeroException("Your string");

and we have to create a class file and extent it with Exception and with a 

Parameterized constructor with String and if we need to pass different message 
for each throw we have to use 
    super (s) 
s is parameter of string

which is given by our constructor and message is passed by out throw statement

if that exception happens that message will go to its exception class constructor 
it is passed to output.

Or if we want to give common error msg just give it with catch (Exception ) block
which can handle all exceptions
*/

public class NotZeroException extends Exception {

    public NotZeroException(String s) {
        super(s);
    }
    
}
