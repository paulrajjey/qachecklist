package redhat.checklist;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class QandAContext implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String id;

   private java.util.List<redhat.checklist.Question> questions;

   private java.util.List<redhat.checklist.Answer> answers;

   public QandAContext()
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

   public addQuestion()
   {

   }

   public java.util.List<redhat.checklist.Question> getQuestions()
   {
      return this.questions;
   }

   public void setQuestions(java.util.List<redhat.checklist.Question> questions)
   {
      this.questions = questions;
   }

   public java.util.List<redhat.checklist.Answer> getAnswers()
   {
      return this.answers;
   }

   public void setAnswers(java.util.List<redhat.checklist.Answer> answers)
   {
      this.answers = answers;
   }

    public void addQuestion(String id, String question){
        
        redhat.checklist.Question question = new redhat.checklist.Question(id,question,null,null,null,null,null,null);
        if(this.questions== null){
            
            this.questions = new java.util.ArrayList<redhat.checklist.Question>();
        }
        this.questions.add(question);
    }
   public QandAContext(java.lang.String id,
         java.util.List<redhat.checklist.Question> questions,
         java.util.List<redhat.checklist.Answer> answers)
   {
      this.id = id;
      this.questions = questions;
      this.answers = answers;
   }

}