package onlineauction;
public class OnlineAuctionSystem {
    public static void main(String[] args) {
        Auction auction = new Auction("Antique Vase");

        Bidder bidder1 = new Bidder("Alice");
        Bidder bidder2 = new Bidder("Bob");
        Bidder bidder3 = new Bidder("Charlie");

        auction.registerObserver(bidder1);
        auction.registerObserver(bidder2);

        auction.itemAvailable();

        auction.startBidding();

        auction.registerObserver(bidder3);

        auction.endBidding();

        auction.unregisterObserver(bidder2);

        auction.itemAvailable();
    }
}
