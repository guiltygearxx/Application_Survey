package androidapp.focus.hoangnam.application_survey.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import androidapp.focus.hoangnam.application_survey.SurveyFlowManager;
import androidapp.focus.hoangnam.application_survey.model.Answer;
import androidapp.focus.hoangnam.application_survey.model.Question;

/**
 * Created by huy.nquoc on 12/23/2017.
 */

public abstract class BaseQuestionActivity extends AppCompatActivity implements QuestionActivity {

    protected SurveyFlowManager surveyFlowManager;

    protected Answer answer;

    private void init() {

        this.surveyFlowManager = SurveyFlowManager.instance;

        Question question = surveyFlowManager.getCurrentQuestion();

        this.answer = surveyFlowManager.initAnswer(question);
    }

    protected abstract Object getAnswerData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        this.init();
    }

    @Override
    public void onBackPressed() {

        surveyFlowManager.goBackPrevQuestion(answer);

        super.onBackPressed();
    }

    @Override
    public void goToNextQuestion() {

        this.answer.setData(this.getAnswerData());

        surveyFlowManager.goToNextQuestion(this, answer);
    }

    public void next(View view) {

        this.goToNextQuestion();
    }
}
