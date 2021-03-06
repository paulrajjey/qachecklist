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

   private redhat.checklist.Answer answer;

   private redhat.checklist.Question nextQuestion;

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
    public void addAnswer(redhat.checklist.Answer a)
   {

      
      if (this.answers == null)
      {

         this.answers = new java.util.ArrayList<redhat.checklist.Answer>();
      }
      this.answers.add(a);
      
   }
   public void addQuestion(redhat.checklist.Question q)
   {

      
      if (this.questions == null)
      {

         this.questions = new java.util.ArrayList<redhat.checklist.Question>();
      }
      this.questions.add(q);
      
   }

   public redhat.checklist.Answer getAnswer()
   {
      return this.answer;
   }

   public void setAnswer(redhat.checklist.Answer answer)
   {
      this.answer = answer;
   }

   public redhat.checklist.Question getNextQuestion()
   {
      return this.nextQuestion;
   }

   public void setNextQuestion(redhat.checklist.Question nextQuestion)
   {
      this.nextQuestion = nextQuestion;
   }

   public QandAContext(java.lang.String id,
         java.util.List<redhat.checklist.Question> questions,
         java.util.List<redhat.checklist.Answer> answers,
         redhat.checklist.Answer answer, redhat.checklist.Question nextQuestion)
   {
      this.id = id;
      this.questions = questions;
      this.answers = answers;
      this.answer = answer;
      this.nextQuestion = nextQuestion;
   }

}