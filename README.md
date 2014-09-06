Mulerator
=========

Mulerator is a Clojure program/lib that is used to determine the highest value combination of pre-packaged dolls for a drug smuggler to use. Before you jump to any conclusions, its actual intent is to solve the [doll-smuggler](https://github.com/micahalles/doll-smuggler) problem as laid out by [Atomic Object](http://atomicobject.com/). The problem is a variant of the knapsack problem.

Basic Setup
===========

Mulerator is built on [Leiningen](http://leiningen.org/) (Clojure program automator) using [Clojure](http://clojure.org/). The fastest way to get started is by using the hombrew package manager (OSX only).

Simply by running:

brew install leiningen

Homebrew will install both the latest version of Clojure and Leiningen. For other install methods, please checkout the [Clojure](http://clojure.org/downloads) and [Leiningen](http://leiningen.org/#install) documentation.

Usage
=====

Once Leiningen is installed, you can run the tests with:

lein test

And teh Mulerator itself with:

lein run

Upon running Mulerator, you will be prompted to enter the max weight that your "mule" carry, and then number of pre-packaged dolls provided by your "dealer". For each doll, you will be prompted by the program to enter a name, weight, and value. After each doll is entered, you will be prompted to answer yes or no to the question "Any more dolls?". If you answer yes you will be able enter another doll, if you answer no, Mulerator will take the information you entered and return the best combination of dolls to use in order to maximize "street value". And that's it!


## License

Copyright © 2014 Mulerator

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
