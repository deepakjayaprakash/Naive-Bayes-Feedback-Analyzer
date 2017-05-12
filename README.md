# Naive Bayes Feedback Analyzer

The project is done as a part of Data Mining project. Instead of using the in-built libraries and interfaces for building a **Naive-Bayes** data mining algorithm, we use the bare formulae to calculate the actual conditional probabilites and apply the Naive Bayes theorem.

## Problem Statement

The origin of the data set is from the feedback forms that are submitted by the students of any department of an institution.
As of now, there are 2 sets of questions which happens to come from 2 types of forms: Faculty feedback forms and Course Feedback forms.

## Flow

The input data is first trained by building a matrix of **conditional probablilites**.
Then an overall *row-wise and column-wise* probablity statistics and then use them to derive two sets of conclusions.

We then use these labelled tuples to output whether the feedback is good or bad

