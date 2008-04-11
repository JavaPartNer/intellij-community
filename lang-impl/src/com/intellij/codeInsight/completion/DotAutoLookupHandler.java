package com.intellij.codeInsight.completion;

public class DotAutoLookupHandler extends CodeCompletionHandler{
  protected boolean isAutocompleteOnInvocation() {
    return false;
  }

  protected boolean isAutocompleteCommonPrefixOnInvocation() {
    return false;
  }

  protected void handleEmptyLookup(CompletionContext context, LookupData lookupData, final CompletionParameters parameters,
                                   final CompletionProgressIndicator indicator){
  }
}
