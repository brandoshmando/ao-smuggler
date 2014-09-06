(ns mulerator.core (:require [mulerator.dealer :refer [max-mule-load dealer-dolls spacer]] [mulerator.optimizer :refer [total-value combo-weight optimize-value]]) (:gen-class))

(defn close-message []
  (spacer )
  (println "Buh bye now!")
  (spacer ))

(defn print-total-value [optimized-combo]
  (println "-----Value/Weight-----")
  (println "Total Value:" (total-value optimized-combo)))

(defn print-total-weight [optimized-combo]
  (println "Total Weight: " (combo-weight optimized-combo)))


(defn print-format [doll]
  (println "Doll Name: " (get doll :doll-name))
  (println "Doll Name: " (get doll :doll-value))
  (println "Doll Name: " (get doll :doll-weight)))

(defn print-optimal-combo [optimized-combo]
  (print-total-value optimized-combo)
  (print-total-weight optimized-combo)
  (println "-----Dolls-----")
  (for [doll optimized-combo](print-format doll)))


(defn -main []
  (let [max-weight (max-mule-load)
        packed-dolls (dealer-dolls)
        optimized-combo (optimize-value packed-dolls max-weight)]
    (println packed-dolls)
    (print-optimal-combo optimized-combo)
    (close-message )))
