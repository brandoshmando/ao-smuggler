(ns mulerator.optimizer-test (:require [clojure.test :refer :all] [mulerator.optimizer :refer [total-value combo-weight powerset]]))

(deftest total-value-returns-total
  (def somevar [{:doll-value 1} {:doll-value 2} {:doll-value 3}])
  (is (= 6 (total-value somevar)))
  )

(deftest combo-weight-returns-total-weight
  (def somevar [{:doll-weight 1} {:doll-weight 2} {:doll-weight 3}])
  (is (= 6 (combo-weight somevar)))
  )

(deftest powerset-returns-all-possible-combos
  (def somevar [{:doll-name "Brandon" :doll-weight 15 :doll-value 20}
                {:doll-name "Craft" :doll-weight 10 :doll-value 15}])
  (def result [{} {:doll-weight 15, :doll-value 20, :doll-name "Brandon"}
                  {:doll-weight 10, :doll-value 15, :doll-name "Craft"}
                  {:doll-weight 10, :doll-value 15, :doll-name "Craft"}])
  (is (= result (powerset somevar)))
  )