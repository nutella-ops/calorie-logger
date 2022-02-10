;;I was trying to add an automatic timestamping
(import java.util.Date)
(defn date [] (str (new java.util.Date)))

;;I was trying to improve the abstractions with then recent knowledge
(defn merge-one-pair [[{name :name, rate :rate, group :group} units]]
    "returns total calories for n units of the foodstuff"
    (let [cals (reduce * [rate units]), pair [name cals]]
        pair))

(defn merge-many-pairs [& more]
    "returns total calories for many foodstuff rations"
    (map merge-one-pair more))

(defn logger [& more]
    "creates user-friendly output"
    (let [total (reduce + (map last more)), foodstuffs (map merge-one-pair more)]
        (println 
            "\n" 
            (date) "--" total "cals." "--" foodstuffs  
            "\n")))

;;I was trying to improve the data structres I was using and add categorization info
(def oj
    {:name "Kirkland orange juice"
    :rate 0.5
    :group 'fruit})

(def acai
    {:name "acai drink"
    :rate 100
    :group 'fruit})
