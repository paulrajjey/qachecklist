package redhat.checklist;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Questionare implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String id;
   private redhat.checklist.Answer answer;

   public Questionare()
   {
   }

   public java.lang.String getId()
   {
      return this.id;
   }

   public void setId(java.lang.String id)
   {
      this.id = id;
   }

   public redhat.checklist.Answer getAnswer()
   {
      return this.answer;
   }

   public void setAnswer(redhat.checklist.Answer answer)
   {
      this.answer = answer;
   }

   public Questionare(java.lang.String id, redhat.checklist.Answer answer)
   {
      this.id = id;
      this.answer = answer;
   }

}