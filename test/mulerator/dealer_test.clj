(ns mulerator.dealer-test
  (:require [clojure.test :refer :all]
            [mulerator.dealer :refer [spacer to_i]]))

; Test for spacer somewhat pointless since it returns nil but does check to see tht identical function returns the same
(deftest test-spacer-is-line
  (defn result []
    (println "---------------"))
  (is (= (result) (spacer )))
  )

(deftest to-i-returns-integer
  (def somevar "200")
  (is (= 200 (to_i somevar)))
  (is (instance? Integer (to_i somevar)))
  )
