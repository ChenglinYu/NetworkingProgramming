
/**
* BulbBrokenException.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from LightBulb.idl
* Tuesday, May 8, 2018 2:41:36 PM CST
*/

public final class BulbBrokenException extends org.omg.CORBA.UserException
{

  public BulbBrokenException ()
  {
    super(BulbBrokenExceptionHelper.id());
  } // ctor


  public BulbBrokenException (String $reason)
  {
    super(BulbBrokenExceptionHelper.id() + "  " + $reason);
  } // ctor

} // class BulbBrokenException