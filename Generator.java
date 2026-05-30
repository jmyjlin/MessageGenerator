import java.util.ArrayList;




public class Generator {
    // instance variables
    private ArrayList<String> compliments;
    private ArrayList<String> insults;
    private ArrayList<String> fortunes;




    // constructor
    public Generator() {
        compliments = new ArrayList<String>();
        insults = new ArrayList<String>();
        fortunes = new ArrayList<String>();




        // declare and add all compliments into compliment ArrayList
        compliments.add("you're such a great person!");
        compliments.add("you're so goated!!!");
        compliments.add("you're the best!");
        compliments.add("you're so fire!!!!!!!");
        compliments.add("you're the best person in the world :)");
        compliments.add("you're smarter than Einstein!!!");
        compliments.add("I love your outfit!");
        compliments.add("you're so cool!!!");
        compliments.add("you're so thoughtful!");
        compliments.add("you're so kind!");
        compliments.add("you're so smart!");
        compliments.add("you bring your positive energy everywhere!");
        compliments.add("you're beautiful!");
        compliments.add("you're so fun to talk to!");
        compliments.add("you're awesome!");
        compliments.add("you matter so much!");
        compliments.add("you have a GREAT smile!");
        compliments.add("you have GREAT eyes!");
        compliments.add("you're funny!");
        compliments.add("you have such cool shoes!!!!!!!!!!!!");




        // declare and add all insults into insults ArrayList
        insults.add("you have terrible taste in fashion yucky");
        insults.add("you're NOT funny");
        insults.add("you're not smart");
        insults.add("you're hecka weird get away from me");
        insults.add("you're slow");
        insults.add("you don't need obstacles, you ARE the obstacle");
        insults.add("you're hella annoying");
        insults.add("my eyes burn the more i look at you");
        insults.add("you're NOT strong weakie haha");
        insults.add("you're so lazy");
        insults.add("you're pretty useless");
        insults.add("even if you try, you will always fail");
        insults.add("you're embarassing");
        insults.add("even god knows you're ugly");
        insults.add("you have ugly toes");
        insults.add("you have ugly eyes");
        insults.add("you have disgusting breath");
        insults.add("no matter what you desire, you will never get that desire");
        insults.add("you annoy me with your voice");
        insults.add("you're going to get a four dollar bill in a red envelope");




        // declare and add all fortunes into fortunes ArrayList
        fortunes.add("you'll become the ceo of mcdonalds and make so much moolah!!!!!!");
        fortunes.add("you'll get 1 billion dollars");
        fortunes.add("you will get so many red envelopes!!!!");
        fortunes.add("hard work will pay off");
        fortunes.add("a goal you have will be achieved soon");
        fortunes.add("good luck is coming");
        fortunes.add("you will pass all your exams");
        fortunes.add("you will get straight A's");
        fortunes.add("you will succeed");
        fortunes.add("good things will happen");
        fortunes.add("today is your lucky day!");
        fortunes.add("you will get accepted to college!");
        fortunes.add("you will go far in life");
        fortunes.add("prosperity is on its way");
        fortunes.add("joy will find you");
        fortunes.add("good fortune surrounds you");
        fortunes.add("may your future be bright");
        fortunes.add("luck will favor you");
        fortunes.add("blessings are coming your way");
        fortunes.add("you will be the richest person in the world");
    }
    
    // get random compliment
    public String getCompliment() {
        int index = (int)(Math.random() * compliments.size());
        return compliments.get(index);
    }
    
    // get random insult
    public String getInsult() {
        int index = (int)(Math.random() * insults.size());
        return insults.get(index);
    }
    
    // get random fortune
    public String getFortune() {
        int index = (int)(Math.random() * fortunes.size());
        return fortunes.get(index);
    }
}
