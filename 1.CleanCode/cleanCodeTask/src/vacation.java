class movie
{
    double charge(int daysRented)
    {
        double result = 0;
        switch (priceCode())
        {
            case REGULAR:
                result += 2;
                if (daysRented > 2)
                {
                    result += (daysRented - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                result += daysRented * 3;
                break;
            case CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                {
                    result += (daysRented - 3) * 1.5;
                }
                break;

        }
        return result;
    }
}
