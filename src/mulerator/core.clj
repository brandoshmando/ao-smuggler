(ns mulerator.core (:require [mulerator.dealer :refer [max-mule-load dealer-dolls]] [mulerator.optimizer]) (:gen-class))

(defn -main []
  (let [max-weight (max-mule-load)
        packed-dolls (dealer-dolls)]
    (println max-weight)))
