package com.kryptonn.jba.config;

/**
 * @author Kryptonn
 * @version 1.0.1
 * @since 1.0.0
 * JBAServerLocales is an enum that contains all the available locales for the Battle.net API.
 * <p>
 * The locales are used to determine the language of the data returned by the API.
 * </p>
 */
public enum JBAServerLocales {
    /**
     * North America / United States
     */
    US("North America","us.api.blizzard.com", "oauth.battle.net","en_US", "static-us"),
    /**
     * North America / Mexico
     */
    MX("North America","us.api.blizzard.com", "oauth.battle.net","es_MX", "static-us"),
    /**
     * North America / Brazil
     */
    BR("North America","us.api.blizzard.com", "oauth.battle.net","pt_BR", "static-us"),

    /**
     * Europe / United Kingdom
     */
    GB("Europe","eu.api.blizzard.com", "oauth.battle.net","en_GB", "static-eu"),
    /**
     * Europe / Spain
     */
    ES("Europe","eu.api.blizzard.com", "oauth.battle.net","es_ES", "static-eu"),
    /**
     * Europe / France
     */
    FR("Europe","eu.api.blizzard.com", "oauth.battle.net","fr_FR", "static-eu"),
    /**
     * Europe / Russia
     */
    RU("Europe","eu.api.blizzard.com", "oauth.battle.net","ru_RU", "static-eu"),
    /**
     * Europe / Germany
     */
    DE("Europe","eu.api.blizzard.com", "oauth.battle.net","de_DE", "static-eu"),
    /**
     * Europe / Portugal
     */
    PT("Europe","eu.api.blizzard.com", "oauth.battle.net","pt_PT", "static-eu"),
    /**
     * Europe / Italy
     */
    IT("Europe","eu.api.blizzard.com", "oauth.battle.net","it_IT", "static-eu"),

    /**
     * China
     */
    KR("Korea","kr.api.blizzard.com", "oauth.battle.net","ko_KR", "static-kr"),

    /**
     * Taiwan
     */
    TW("Taiwan","tw.api.blizzard.com", "oauth.battle.net","zh_TW", "static-tw"),

    /**
     * Southeast Asia / Singapore
     */
    CN("China","gateway.battlenet.com.cn","oauth.battlenet.com.cn", "zh_CN", "static-cn");


    private final String region;
    private final String host;
    private final String oAuth;
    private final String locale;
    private final String staticNamespace;

    /**
     * Constructs a JBAServerLocales instance with the provided region, host, oAuth and locale.
     * @param region The region of the JBAServerLocales instance.
     * @param host The host of the JBAServerLocales instance.
     * @param oAuth The oAuth of the JBAServerLocales instance.
     * @param locale The locale of the JBAServerLocales instance.
     */
    JBAServerLocales(String region, String host, String oAuth, String locale, String staticNamespace) {
        this.region = region;
        this.host = host;
        this.oAuth = oAuth;
        this.locale = locale;
        this.staticNamespace = staticNamespace;
    }

    /**
     * Returns the region of the JBAServerLocales instance.
     * @return the region of the JBAServerLocales instance.
     */
    public String getHost() {
        return "https://" +host;
    }

    /**
     * Returns the host of the JBAServerLocales instance.
     * @return the host of the JBAServerLocales instance.
     */
    public String getRegion() {
        return region;
    }

    /**
     * Returns the locale of the JBAServerLocales instance.
     * @return the locale of the JBAServerLocales instance.
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Returns the oAuth of the JBAServerLocales instance.
     * @return the oAuth of the JBAServerLocales instance.
     */
    public String getOAuth() {
        return oAuth;
    }

    public String getStaticNamespace() {
        return staticNamespace;
    }
}