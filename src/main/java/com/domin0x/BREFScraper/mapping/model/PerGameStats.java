package com.domin0x.BREFScraper.mapping.model;

import java.math.BigDecimal;

public class PerGameStats {

    private Team team;
    private Player player;
    private String externalId;
    private SeasonType seasonType;
    private int season;
    private int gamesPlayed;
    private int gamesStarted;
    private BigDecimal mp;
    private BigDecimal fgm;
    private BigDecimal fga;
    private BigDecimal fg3m;
    private BigDecimal fg3a;
    private BigDecimal ftm;
    private BigDecimal fta;
    private BigDecimal oreb;
    private BigDecimal dreb;
    private BigDecimal reb;
    private BigDecimal ast;
    private BigDecimal blk;
    private BigDecimal stl;
    private BigDecimal tov;
    private BigDecimal pf;
    private BigDecimal pts;
    private BigDecimal fg_pct;
    private BigDecimal fg3_pct;
    private BigDecimal ft_pct;

    public Team getTeam() {
        return team;
    }

    public Player getPlayer() {
        return player;
    }

    public String getExternalId() {
        return externalId;
    }

    public SeasonType getSeasonType() {
        return seasonType;
    }

    public int getSeason() {
        return season;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public int getGamesStarted() {
        return gamesStarted;
    }

    public BigDecimal getMp() {
        return mp;
    }

    public BigDecimal getFgm() {
        return fgm;
    }

    public BigDecimal getFga() {
        return fga;
    }

    public BigDecimal getFg3m() {
        return fg3m;
    }

    public BigDecimal getFg3a() {
        return fg3a;
    }

    public BigDecimal getFtm() {
        return ftm;
    }

    public BigDecimal getFta() {
        return fta;
    }

    public BigDecimal getOreb() {
        return oreb;
    }

    public BigDecimal getDreb() {
        return dreb;
    }

    public BigDecimal getReb() {
        return reb;
    }

    public BigDecimal getAst() {
        return ast;
    }

    public BigDecimal getBlk() {
        return blk;
    }

    public BigDecimal getStl() {
        return stl;
    }

    public BigDecimal getTov() {
        return tov;
    }

    public BigDecimal getPf() {
        return pf;
    }

    public BigDecimal getPts() {
        return pts;
    }

    public BigDecimal getFg_pct() {
        return fg_pct;
    }

    public BigDecimal getFg3_pct() {
        return fg3_pct;
    }

    public BigDecimal getFt_pct() {
        return ft_pct;
    }

    public static class Builder {

        private Team team;
        private Player player;
        private String externalId;
        private SeasonType seasonType;
        private int season;
        private int gamesPlayed;
        private int gamesStarted;
        private BigDecimal mp;
        private BigDecimal fgm;
        private BigDecimal fga;
        private BigDecimal fg3m;
        private BigDecimal fg3a;
        private BigDecimal ftm;
        private BigDecimal fta;
        private BigDecimal oreb;
        private BigDecimal dreb;
        private BigDecimal reb;
        private BigDecimal ast;
        private BigDecimal blk;
        private BigDecimal stl;
        private BigDecimal tov;
        private BigDecimal pf;
        private BigDecimal pts;
        private BigDecimal fg_pct;
        private BigDecimal fg3_pct;
        private BigDecimal ft_pct;

        public Builder() {
        }

        public Builder setTeam(Team team){
            this.team = team;
            return Builder.this;
        }

        public Builder setPlayer(Player player){
            this.player = player;
            return Builder.this;
        }

        public Builder setExternalId(String externalId){
            this.externalId = externalId;
            return Builder.this;
        }

        public Builder setSeasonType(SeasonType seasonType){
            this.seasonType = seasonType;
            return Builder.this;
        }

        public Builder setSeason(int season){
            this.season = season;
            return Builder.this;
        }

        public Builder setGamesPlayed(int gamesPlayed){
            this.gamesPlayed = gamesPlayed;
            return Builder.this;
        }

        public Builder setGamesStarted(int gamesStarted){
            this.gamesStarted = gamesStarted;
            return Builder.this;
        }

        public Builder setMp(BigDecimal mp){
            this.mp = mp;
            return Builder.this;
        }

        public Builder setFgm(BigDecimal fgm){
            this.fgm = fgm;
            return Builder.this;
        }

        public Builder setFga(BigDecimal fga){
            this.fga = fga;
            return Builder.this;
        }

        public Builder setFg3m(BigDecimal fg3m){
            this.fg3m = fg3m;
            return Builder.this;
        }

        public Builder setFg3a(BigDecimal fg3a){
            this.fg3a = fg3a;
            return Builder.this;
        }

        public Builder setFtm(BigDecimal ftm){
            this.ftm = ftm;
            return Builder.this;
        }

        public Builder setFta(BigDecimal fta){
            this.fta = fta;
            return Builder.this;
        }

        public Builder setOreb(BigDecimal oreb){
            this.oreb = oreb;
            return Builder.this;
        }

        public Builder setDreb(BigDecimal dreb){
            this.dreb = dreb;
            return Builder.this;
        }

        public Builder setReb(BigDecimal reb){
            this.reb = reb;
            return Builder.this;
        }

        public Builder setAst(BigDecimal ast){
            this.ast = ast;
            return Builder.this;
        }

        public Builder setBlk(BigDecimal blk){
            this.blk = blk;
            return Builder.this;
        }

        public Builder setStl(BigDecimal stl){
            this.stl = stl;
            return Builder.this;
        }

        public Builder setTov(BigDecimal tov){
            this.tov = tov;
            return Builder.this;
        }

        public Builder setPf(BigDecimal pf){
            this.pf = pf;
            return Builder.this;
        }

        public Builder setPts(BigDecimal pts){
            this.pts = pts;
            return Builder.this;
        }

        public Builder setFg_pct(BigDecimal fg_pct){
            this.fg_pct = fg_pct;
            return Builder.this;
        }

        public Builder setFg3_pct(BigDecimal fg3_pct){
            this.fg3_pct = fg3_pct;
            return Builder.this;
        }

        public Builder setFt_pct(BigDecimal ft_pct){
            this.ft_pct = ft_pct;
            return Builder.this;
        }

        public PerGameStats build() {

            return new PerGameStats(this);
        }
    }

    private PerGameStats(Builder builder) {
        this.team = builder.team;
        this.player = builder.player;
        this.externalId = builder.externalId;
        this.season = builder.season;
        this.seasonType = builder.seasonType;
        this.gamesPlayed = builder.gamesPlayed;
        this.gamesStarted = builder.gamesStarted;
        this.mp = builder.mp;
        this.fgm = builder.fgm;
        this.fga = builder.fga;
        this.fg3m = builder.fg3m;
        this.fg3a = builder.fg3a;
        this.ftm = builder.ftm;
        this.fta = builder.fta;
        this.oreb = builder.oreb;
        this.dreb = builder.dreb;
        this.reb = builder.reb;
        this.ast = builder.ast;
        this.blk = builder.blk;
        this.stl = builder.stl;
        this.tov = builder.tov;
        this.pf = builder.pf;
        this.pts = builder.pts;
        this.fg_pct = builder.fg_pct;
        this.fg3_pct = builder.fg3_pct;
        this.ft_pct = builder.ft_pct;
    }

}
