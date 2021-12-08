package net.serenity.bdd.cucumber4.starter.search;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class Help{
    @Step("This will concat from Helper ")
    public void contactMyName(String name){
        System.out.println("My name is "+name+""+"JADHAV");
    }
}
