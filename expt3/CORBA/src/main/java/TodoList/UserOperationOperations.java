package TodoList;


/**
* TodoList/UserOperationOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from TodoList.idl
* Thursday, May 17, 2018 7:45:08 PM CST
*/

public interface UserOperationOperations 
{
  boolean add (String startTime, String endTime, String description);
  String query (String startTime, String endTime);
  boolean delete (String key);
  boolean clear ();
  String show ();
} // interface UserOperationOperations