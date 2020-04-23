package org.mula.finance.Models;

import android.os.Parcel;
import org.mula.finance.R;

import java.util.ArrayList;

//class for objects to classify restaurants
public class Article {

    //unique ID for Article object
    private int articleID;
    //name, type of cuisine, location, rating
    private String articleTitle;
    private String articleCategory;
    private int imageID;
    private String articleSnippet;
    private String articleFull;


    public Article() {
    }

    public Article(int articleID, String articleTitle, String articleCategory, int imageID, String articleSnippet, String articleFull) {
        this.articleID = articleID;
        this.articleTitle = articleTitle;
        this.articleCategory = articleCategory;
        this.imageID = imageID;
        this.articleSnippet = articleSnippet;
        this.articleFull = articleFull;
    }

    public Article(Parcel source) {
        articleID = source.readInt();
        articleTitle = source.readString();
        articleCategory = source.readString();
        imageID = source.readInt();
        articleSnippet = source.readString();
        articleFull = source.readString();

    }

    public int getArticleID() {
        return articleID;
    }

    public void setArticleID(int articleID) {
        this.articleID = articleID;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleCategory() {
        return articleCategory;
    }

    public void setArticleCategory(String articleCategory) {
        this.articleCategory = articleCategory;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getArticleSnippet() {
        return articleSnippet;
    }

    public void setArticleSnippet(String articleSnippet) {
        this.articleSnippet = articleSnippet;
    }

    public String getArticleFull() {
        return articleFull;
    }

    public void setArticleFull(String articleFull) {
        this.articleFull = articleFull;
    }

    public static ArrayList<Article> getSavingsList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,
                "How to choose the best bank and bank accounts with the highest interest?",
                "Savings",
                R.drawable.ic_piggy_bank,
                "Check your banks for online account options!",
                "Zero fees and high interest rates are impossible, right? Actually, no!\n" +
                        "\n" +
                        "Online banks often provide the best interest rates. Their overhead costs are minimal, and they don’t have to spend money on branches or marketing. Consequently, their customer service is better, and they can handle lower profit margins than traditional banks. They also offer interest rates six to 10 times higher than a conventional bank.\n" +
                        "\n" +
                        "Let’s say you put away $25,000. This would give you $750 in one year at a three percent interest rate at an online bank. Contrast this with a regular bank at a rate of 0.5 percent and you would get a meagre $125. Now imagine you saved $50,000. You'd receive $1,500 at an online bank and a paltry $250 at a regular bank!\n" +
                        "\n" +
                        "Next, get the best bank accounts. The minimum should be one checking account and one savings account.\n" +
                        "\n" +
                        "You need checking accounts for frequent withdrawals and savings accounts for goals like vacations or special events.\n" +
                        "\n" +
                        "You have a few choices here: have your checking and savings account at the same bank (the lazy option); have your checking account at a local bank and a savings account at an online bank (the normal choice); or numerous checking and savings accounts, the best choice for those who aren’t scared of effort and want to optimize their accounts for different goals.\n" +
                        "\n" +
                        "Or you can keep one and a half months of living expenses in your checking account and put everything else into your savings account.\n" +
                        "\n" +
                        "If having numerous accounts sounds like too much, then simply opt for a no-fees checking account at a local bank and a high interest rate savings account at an online bank."));
        articles.add(new Article(1,
                "How much do you spend and how do you direct your money to where it needs to be?",
                "Savings",
                R.drawable.ic_piggy_bank,
                "Breaking down your expenditure into a plan, can help you save!",
                "Remember the last time you felt guilty about buying something, but bought it anyway? Next time you’ll know better after you learn how to spend consciously.\n" +
                        "\n" +
                        "Conscious spending is about reducing the amount of money you spend on things that aren’t so important to you and spending more on things that you really care about.\n" +
                        "\n" +
                        "All you need to do is adopt a Conscious Spending Plan. Automatically save and invest a given amount per month and spend the rest on whatever you want, guilt-free.\n" +
                        "\n" +
                        "The percentage you spend on different things can be broken down into:\n" +
                        "\n" +
                        "• 60 percent on fixed costs (rent, utilities, debt)\n" +
                        "\n" +
                        "• 10 percent on investments (Super)\n" +
                        "\n" +
                        "• 10 percent on savings (vacations, gifts, unexpected expenses)\n" +
                        "\n" +
                        "• 20 percent on guilt-free spending\n" +
                        "\n" +
                        "Conscious spending means thinking about what’s important to you. For example, the author's friend Jim moved to a smaller apartment after he got a raise. Why? His living space didn’t matter much to him, but he loved going camping, so he put his money towards that.\n" +
                        "\n" +
                        "Next, learn to adjust your spending.\n" +
                        "\n" +
                        "You can try “the envelope system,” in which you decide how much you wish to spend on the four areas above and put that money in envelopes, so when they’re empty, there’s no more spending for that month.\n" +
                        "\n" +
                        "“Envelopes” may also be metaphoric; the author's friend opened a bank account with a debit card that acted as an envelope. Each month she loads money onto the card for socializing and when the money’s gone, she doesn’t go out.\n" +
                        "\n" +
                        "Changing from one extreme behaviour takes a while, so tweak your spending rather than, for example, saving $495 a week if you were previously spending $500 a week. Choose one or two major problem areas and work on those, rather than trying to carve out 5 percent from numerous areas.\n" +
                        "\n" +
                        "Overdraft fees, for instance, can add up to over $1,000 per year. Erasing that alone will make a massive difference."));
        articles.add(new Article(2,
                "How to automate your money",
                "Savings",
                R.drawable.ic_piggy_bank,
                "Don’t let people tell you how to save and spend your money.\n" +
                        "\n" +
                        "You don’t need to scrimp and save on all the “right” or “acceptable” things. Instead, pick what’s really important for you to splurge or save on. For instance, if owning a collection of limited-edition sneakers is more important to you than dining out every week, scrimp on the dining and spend on the shoes!",
                "Automate your bill payments so you don't have to think about them.\n" +
                        "\n" +
                        "Paying bills is inconvenient and annoying. If you’re not crazy about managing money, create an automated system to do it for you.\n" +
                        "\n" +
                        "Take the Conscious Spending Plan and automate it using your bank and your own tools for tracking your spending.\n" +
                        "\n" +
                        "Conscious Spending Plan: automatically save and invest a given amount per month and spend the rest on whatever you want, guilt-free.\n" +
                        "\n" +
                        "The percentage you spend on different things can be broken down into:\n" +
                        "\n" +
                        "• 60 percent on fixed costs (rent, utilities, debt)\n" +
                        "\n" +
                        "• 10 percent on investments (Super)\n" +
                        "\n" +
                        "• 10 percent on savings (vacations, gifts, unexpected expenses)\n" +
                        "\n" +
                        "• 20 percent on guilt-free spending\n" +
                        "\n" +
                        "First, contact your bank to set up automatic transfers and payments.\n" +
                        "\n" +
                        "For example, set up automatic payments for fixed costs and automate withdrawals from your checking account to your Super.\n" +
                        "\n" +
                        "Once this is done, use the remaining money for spending and set mid-month calendar reminders to inform you if you’re exceeding your spending goals. A good idea is to also have $1,000 in your checking account as a reserve.\n" +
                        "\n" +
                        "If your spending is going according to plan, then great! If not, use the next 15 days to get back on track.\n" +
                        "\n" +
                        "Another excellent idea is to implement an Automatic Money Flow by connecting all your accounts and creating automatic transfers.\n" +
                        "\n" +
                        "The transfers can be organized in the following way:\n" +
                        "\n" +
                        "Your paycheck should fund your super and checking account, and your checking account should fund your savings account, credit card, fixed costs where you can’t use a credit card (like rent), and the odd amount of spending money. Your credit card should finance other fixed costs and guilt-free spending.\n" +
                        "\n" +
                        "But how exactly can you link all your accounts? Simply automate all transfers and payments:\n" +
                        "\n" +
                        "Say you get paid on the first of the month. On the second, automatically send a portion of your paycheck to your super and all that’s left over into your checking account. On the fifth, automatically transfer money to your savings account from your checking account. On the seventh, automatically pay off your bills and your credit card. "));
        articles.add(new Article(3,
                "How to..",
                "Savings",
                R.drawable.ic_piggy_bank,
                "snippet",
                ""));
        return articles;
    }

    public static ArrayList<Article> getRetirementList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,
                "How super works?",
                "Retirement",
                R.drawable.ic_super,
                "Throughout your working life, check your super at least annually. Check your fund has the correct personal details and tax file number\n" +
                        "\n" +
                        "(TFN). Review your employer's contributions, and your account fees, investment options and insurance. If you’re not satisfied or don’t understand any details about your fund, call them and ask questions.",
                "You pay tax at reduced rate/or when you take it out."));
        articles.add(new Article(1,
                "How to",
                "Retirement",
                R.drawable.ic_super,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(2,
                "How to",
                "Retirement",
                R.drawable.ic_super,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,
                "How to",
                "Retirement",
                R.drawable.ic_super,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }

    public static ArrayList<Article> getInvestmentList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,
                "How to Invest Simply?",
                "Investment",
                R.drawable.ic_investment_pink,
                "snippet",
                "Ignore experts and invest the simple way.\n" +
                        "\n" +
                        "Experts are always going on about choosing stocks. But there’s a much simpler way to invest.\n" +
                        "\n" +
                        "Don’t believe the experts. Not one of them can consistently predict how funds or stocks will perform in the market over time.\n" +
                        "\n" +
                        "Much like Frederic Brochet’s 2001 study, which found that wine experts weren’t able to distinguish between wines, financial experts can’t always be trusted. This is because they can’t see the future. The reality is, no matter what they say, experts are frequently wrong.\n" +
                        "\n" +
                        "Daniel Solin, author of The Smartest Investment Book You'll Ever Read, described some research which revealed that 47 of 50 advisory firms persistently advised investors on shares in companies right up until the date they filed for bankruptcy!\n" +
                        "\n" +
                        "Therefore, bypass expertise, and opt for the simplest path to investing.\n" +
                        "\n" +
                        "Picture an investment pyramid in which each category has an asset class. That is, stocks, bonds, and cash are at the base, index and mutual funds are in the middle, and lifecycle funds are at the top.\n" +
                        "\n" +
                        "These investments become more complicated as you move down the pyramid, so the simplest approach is through automatic lifecycle funds, also known as age-based funds. Which aspects of the pyramid you invest in shifts depending on your age.\n" +
                        "\n" +
                        "For instance, if you are a 25-year-old, Vanguard Target Retirement 2050 offers 90 percent stocks and 10 percent bonds, but if you are 55, it offers only 63 percent stocks and 37 percent bonds.\n" +
                        "\n" +
                        "As you can see, in your twenties, more of your assets are in stocks. This is because you can afford to take the risk at this age. As you get older, the balance moves accordingly, and lifecycle funds make things easier by automatically adjusting for you.\n" +
                        "\n" +
                        "The great thing about lifestyle funds is that you only have to own one fund."));
        articles.add(new Article(1,
                "How to open investment accounts even if you only have $50?",
                "Investment",
                R.drawable.ic_investment_pink,
                "snippet",
                ""));
        articles.add(new Article(
                2,
                "Lankan Filling Station",
                "Investment",
                R.drawable.ic_investment_pink,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,
                "Lankan Filling Station",
                "Investment",
                R.drawable.ic_investment_pink,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }
    public static ArrayList<Article> getCreditCardList() {
        ArrayList<Article> articles = new ArrayList<>();
        articles.add(new Article(0,
                "How to use credit cards smartly?",
                "Credit Card",
                R.drawable.ic_credit_card,
                "Be smart with unexpected gifts.\n" +
                        "\n" +
                        "The next time you receive an unexpected monetary gift or bonus, such as a payrise, save 50 percent and spend the rest in whichever way you want. This way, you won’t get used to spending more than you can afford.",
                "Understanding how to harness the power of credit cards will be your first step towards saving money and getting rich.\n" +
                "\n" +
                "Our most significant purchases are often made on credit, and people with good credit are able to put aside a lot of money. Credit comes in the form of loans, mortgages and credit cards and it enables you to buy big purchases when you don’t have the money for them immediately.\n" +
                "\n" +
                "Keep in mind two central aspects of credit: a credit report, which records your credit activity and gives potential lenders information related to this, and a credit score, a number between 300 and 850 that denotes your credit risk to lenders.\n" +
                "\n" +
                "If your credit score is good, you’ll be attractive to lenders, which means they can grant you better loan interest rates. What’s even better about this is that a good credit score can save you hundreds of thousands of dollars in interest.\n" +
                "\n" +
                "For example, in 2009, the annual percentage rate in the USA showed that with a good credit score (750-850) on a $200,000 mortgage over 30 years, you'd pay $359,867, including interest. A bad credit score (620-639) would land you with $430,427 to pay. That’s $70,000 extra!\n" +
                "\n" +
                "The most important credit vehicle is credit cards. Here’s a couple of smart tips for successful credit handling:\n" +
                "\n" +
                "Kill your debt: reduce spending and pay it off! Punctual debt payments account for 35 percent of your credit score, so arranging automatic credit card payments will ensure you never skip a payment.\n" +
                "\n" +
                "Next, it’s worth contacting your credit card company and requesting they waive your annual fees and service charges and reduce your annual percentage rate. Surprisingly, many are willing to do so.\n" +
                "\n" +
                "Remember to seek out the best benefits you can from credit card companies. Some credit cards give you access to concierge services that may be able to book sold out tickets for shows, help you book your next travel adventure or even give additional travel insurance so that you and your loved ones are covered in case of an emergency."
                ));
        articles.add(new Article(1,
                "Lankan Filling Station",
                "Credit Card",
                R.drawable.ic_credit_card,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(2,
                "Lankan Filling Station",
                "Credit Card",
                R.drawable.ic_credit_card,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        articles.add(new Article(3,
                "Lankan Filling Station",
                "Credit Card",
                R.drawable.ic_credit_card,
                "snippet",
                "It's about as narrow as a corridor, and boy is that kitchen tiny, but what Lankan Filling Station lacks in elbow room it makes up for in high-voltage energy and kaleidoscopic flavour. Cover your table in curries and sambols, tear off a corner of a lacy hopper and swipe that spongy base through it all in one fell swoop. Every experience here is a different adventure. What remains the same is the urge to keep exploring this vibrant, visceral cooking knowing full well that more than just your stomach will be nourished. "));
        return articles;
    }
}


