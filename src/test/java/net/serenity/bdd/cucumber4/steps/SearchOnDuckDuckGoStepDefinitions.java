package net.serenity.bdd.cucumber4.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import net.serenity.bdd.cucumber4.starter.navigation.NavigateTo;
import net.serenity.bdd.cucumber4.starter.search.SearchFor;
import net.serenity.bdd.cucumber4.starter.search.SearchResult;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
//import starter.navigation.NavigateTo;
//import starter.search.SearchFor;
//import starter.search.SearchResult;

import static net.serenity.bdd.cucumber4.starter.matchers.TextMatcher.textOf;

public class SearchOnDuckDuckGoStepDefinitions {

    @Managed
    WebDriver browser;

    @Steps
    NavigateTo navigateTo;

    @Steps
    SearchFor searchFor;

    @Steps
    SearchResult searchResult;

    @Given("^(?:.*) is on the DuckDuckGo home page")
    public void i_am_on_the_DuckDuckGo_home_page() {
        navigateTo.theDuckDuckGoHomePage();
    }

    @When("^s?he (?:searches|has searched|searching) for \"(.*)\"")
    public void i_search_for(String term) {
        searchFor.term(term);
    }


    @When("^s?he (?:searches|has searched) again for \"(.*)\"")
    public void i_search_again_for(String term) {
        searchFor.termOnSearchResultsPage(term);
    }

    @Then("all the result titles should contain the word {string}")
    public void all_the_result_titles_should_contain_the_word(String expectedTerm) {
//        assertThat(searchResult.titles())
//                .allMatch(title -> textOf(title).containsIgnoringCase(expectedTerm));
    }

    @And("My name is {string}")
    public void myNameIs(String name) {
        searchFor.printMyName(name);
    }
}
