package org.uushoppping.pojo;

import java.util.Objects;

/**
 * 密保问题表
 */
public class SecurityQuestion {
    // 密保问题id
    private int securityQuestionId;
    // 密保问题
    private String question;
    // 密保问题的答案
    private String answer;

    public SecurityQuestion() {
    }

    public SecurityQuestion(int securityQuestionId, String question, String answer) {
        this.securityQuestionId = securityQuestionId;
        this.question = question;
        this.answer = answer;
    }

    public SecurityQuestion(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public int getSecurityQuestionId() {
        return securityQuestionId;
    }

    public void setSecurityQuestionId(int securityQuestionId) {
        this.securityQuestionId = securityQuestionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecurityQuestion that = (SecurityQuestion) o;
        return securityQuestionId == that.securityQuestionId &&
                Objects.equals(question, that.question) &&
                Objects.equals(answer, that.answer);
    }

    @Override
    public int hashCode() {

        return Objects.hash(securityQuestionId, question, answer);
    }

    @Override
    public String toString() {
        return "SecurityQuestion{" +
                "securityQuestionId=" + securityQuestionId +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}