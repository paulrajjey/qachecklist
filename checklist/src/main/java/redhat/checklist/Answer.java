package redhat.checklist;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Answer implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String questionId;
   private java.lang.String answer;
   private java.lang.String nextQuestionId;
   private java.lang.String nextQuestion;

   private java.lang.String nextQuestionTYpe;

   private java.lang.String questionareID;

   private java.lang.String question;

   public Answer()
   {
   }

   public java.lang.String getQuestionId()
   {
      return this.questionId;
   }

   public void setQuestionId(java.lang.String questionId)
   {
      this.questionId = questionId;
   }

   public java.lang.String getAnswer()
   {
      return this.answer;
   }

   public void setAnswer(java.lang.String answer)
   {
      this.answer = answer;
   }

   public java.lang.String getNextQuestionId()
   {
      return this.nextQuestionId;
   }

   public void setNextQuestionId(java.lang.String nextQuestionId)
   {
      this.nextQuestionId = nextQuestionId;
   }

   public java.lang.String getNextQuestion()
   {
      return this.nextQuestion;
   }

   public void setNextQuestion(java.lang.String nextQuestion)
   {
      this.nextQuestion = nextQuestion;
   }

   public java.lang.String getNextQuestionTYpe()
   {
      return this.nextQuestionTYpe;
   }

   public void setNextQuestionTYpe(java.lang.String nextQuestionTYpe)
   {
      this.nextQuestionTYpe = nextQuestionTYpe;
   }

   public java.lang.String getQuestionareID()
   {
      return this.questionareID;
   }

   public void setQuestionareID(java.lang.String questionareID)
   {
      this.questionareID = questionareID;
   }

   public java.lang.String getQuestion()
   {
      return this.question;
   }

   public void setQuestion(java.lang.String question)
   {
      this.question = question;
   }

   public Answer(java.lang.String questionId, java.lang.String answer,
         java.lang.String nextQuestionId, java.lang.String nextQuestion,
         java.lang.String nextQuestionTYpe, java.lang.String questionareID,
         java.lang.String question)
   {
      this.questionId = questionId;
      this.answer = answer;
      this.nextQuestionId = nextQuestionId;
      this.nextQuestion = nextQuestion;
      this.nextQuestionTYpe = nextQuestionTYpe;
      this.questionareID = questionareID;
      this.question = question;
   }

}