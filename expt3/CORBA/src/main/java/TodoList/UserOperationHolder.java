package TodoList;

/**
* TodoList/UserOperationHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from TodoList.idl
* Thursday, May 17, 2018 7:45:08 PM CST
*/

public final class UserOperationHolder implements org.omg.CORBA.portable.Streamable
{
  public TodoList.UserOperation value = null;

  public UserOperationHolder ()
  {
  }

  public UserOperationHolder (TodoList.UserOperation initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = TodoList.UserOperationHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    TodoList.UserOperationHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return TodoList.UserOperationHelper.type ();
  }

}
