(defn destruc [[{rate :rate} grams]]
    "test function for destruction study"
    (reduce * [rate grams]))

(defn logger [& more]
    "takes n data pairs and maps destruc to each"
    (map destruc more))

(def oj
    {:name "Kirkland orange juice"
    :rate 0.5
    :group 'fruit})

(def acai
    {:name "acai drink"
    :rate 100
    :group 'fruit})