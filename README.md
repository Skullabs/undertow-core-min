# undertow-core-min
Stripped out version of Undertow's core that provides its main funcionalities at a lower footprint.

## Is this some sort of Undertow's fork? 
This project doesn't strive to overcome Undertow's internal design flaws, neither aims to become its replacement.
This is basically the same version available on Maven Central, but packaged only with the required classes to have
the server up-and-running.

As the time passed by Undertow Core became fatter - probably to fit some requirements by JBoss EAP/Wildfly. Some scenarios
may require a lighter version, specially when used as third-party library for frameworks or embedded solutions.

## Reporting Bugs/Feature Requests

We welcome you to use the GitHub issue tracker to report bugs or suggest features.

When filing an issue, please check existing open, or recently closed, issues to make sure somebody else hasn't already 
reported the issue. Please try to include as much information as you can. Details like these are incredibly useful:

* A reproducible test case or series of steps
* The version of our code being used
* Any modifications you've made relevant to the bug
* Anything unusual about your environment or deployment


## Contributing via Pull Requests
Contributions via pull requests are much appreciated. Before sending us a pull request, please ensure that:

1. You are working against the latest source on the *master* branch.
2. You check existing open, and recently merged, pull requests to make sure someone else hasn't addressed the problem already.
3. You open an issue to discuss any significant work - we would hate for your time to be wasted.

To send us a pull request, please:

1. Fork the repository.
2. Modify the source; please focus on the specific change you are contributing. If you also reformat all the code, it will be hard for us to focus on your change.
3. Ensure local tests pass.
4. Commit to your fork using clear commit messages.
5. Send us a pull request, answering any default questions in the pull request interface.
6. Pay attention to any automated CI failures reported in the pull request, and stay involved in the conversation.

GitHub provides additional document on [forking a repository](https://help.github.com/articles/fork-a-repo/) and 
[creating a pull request](https://help.github.com/articles/creating-a-pull-request/).


## Finding contributions to work on
Looking at the existing issues is a great way to find something to contribute on. As our projects, by default, use the default GitHub issue labels ((enhancement/bug/duplicate/help wanted/invalid/question/wontfix), looking at any 'help wanted' issues is a great place to start. 

## License
Just as all other open source library developed by Skullabs, this source code is licenced under the Apache License 2 terms.
