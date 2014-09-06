(ns mulerator.core (:require [mulerator.dealer :refer [max-mule-load dealer-dolls spacer]] [mulerator.optimizer :refer [total-value combo-weight optimize-value]]) (:gen-class))

; Throws message when program completes
(defn close-message []
  (spacer )
  (println "Buh bye now!")
  (spacer ))
; Prints the total value of the optimized doll combination
(defn print-total-value [optimized-combo]
  (println "-----Value/Weight-----")
  (println "Total Value:" (total-value optimized-combo)))
; Prints the total weight of the optimized doll combination
(defn print-total-weight [optimized-combo]
  (println "Total Weight: " (combo-weight optimized-combo)))

; Formats and prints values of each doll
(defn print-format [doll]
  (println "Doll Name: " (get doll :doll-name))
  (println "Doll Name: " (get doll :doll-value))
  (println "Doll Name: " (get doll :doll-weight)))
; Initiates print of optimized doll combination to repl
(defn print-optimal-combo [optimized-combo]
  (print-total-value optimized-combo)
  (print-total-weight optimized-combo)
  (println "-----Dolls-----")
  ; For each doll in the optimized doll combo call print format to print to repl
  (for [doll optimized-combo](print-format doll)))

; Function caller/initializer of the Mulerator program
(defn -main []
  ;Get the max weight from the user
  (let [max-weight (max-mule-load)
        ;Get the packed dolls from the user
        packed-dolls (dealer-dolls)
        ; Get the optimized combo and pass in packed-dolls and max-weight
        optimized-combo (optimize-value packed-dolls max-weight)]
    ;print optimal combo with the optimized-combo
    (print-optimal-combo optimized-combo)
    ; Throw closing message
    (close-message )))
