(ns mulerator.dealer (:gen-class))
; Method that just prints a line so as to stay as DRY as possible
(defn spacer []
  (println "---------------"))
; Takes a string and makes it an integer
(defn to_i [string]
  (Integer. (re-find #"\d+" string)))
; Prints a prompt based on the provided call and then recieves user input
(defn user-input-int [call]
  (spacer )
  (println (format "%s:" call))
  to_i(read-line))
; Gets max-mule-load from user using user input function
(defn max-mule-load []
  (user-input-int "What is the max weight the mule can carry today?"))
; Loops through and prompts user for packed doll data provided by their dealer. This is where things go awry. Should be popping a bunch of maps into a vector but throwing an error instead. I am out of time unfortunately.
(defn dealer-dolls []
  (vec
    (loop [x 0]
      (when (== x 0)
        (spacer )
        (println "Doll name?:")
        (hash-map
          :dollname (read-line)
          :dollvalue (user-input-int "Doll Value")
          :dollweight (user-input-int "Doll Weight"))
        (println "Any more dolls? (Yes/No)")
        (def prompt-answer (read-line))
        ; Logic to break loop if user ansers no to any more dolls
        (if (= (clojure.string/lower-case prompt-answer) "no") (inc x) (recur(+ x 0)))))))
