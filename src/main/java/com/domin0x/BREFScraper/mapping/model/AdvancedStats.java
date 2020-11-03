package com.domin0x.BREFScraper.mapping.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvRecurse;

import java.math.BigDecimal;

public class AdvancedStats {
    @CsvRecurse
    private Team team;
    @CsvRecurse
    private Player player;
    @CsvBindByName
    private SeasonType seasonType;
    @CsvBindByName
    private int year;
    @CsvBindByName
    private int gamesPlayed;
    @CsvBindByName
    private BigDecimal mp;
    @CsvBindByName
    private BigDecimal per;
    @CsvBindByName
    private BigDecimal trueShootingPct;
    @CsvBindByName
    private BigDecimal threePointAttemptRate;
    @CsvBindByName
    private BigDecimal freeThrowAttemptRate;
    @CsvBindByName
    private BigDecimal offRebPct;
    @CsvBindByName
    private BigDecimal defRebPct;
    @CsvBindByName
    private BigDecimal totalRebPct;
    @CsvBindByName
    private BigDecimal assistPct;
    @CsvBindByName
    private BigDecimal stealPct;
    @CsvBindByName
    private BigDecimal blockPct;
    @CsvBindByName
    private BigDecimal turnOverPct;
    @CsvBindByName
    private BigDecimal usagePct;
    @CsvBindByName
    private BigDecimal offWinShares;
    @CsvBindByName
    private BigDecimal defWinShares;
    @CsvBindByName
    private BigDecimal winShares;
    @CsvBindByName
    private BigDecimal winSharesPer48;
    @CsvBindByName
    private BigDecimal offBoxPlusMinus;
    @CsvBindByName
    private BigDecimal defBoxPlusMinus;
    @CsvBindByName
    private BigDecimal boxPlusMinus;
    @CsvBindByName
    private BigDecimal valueOverReplacement;

    public static class Builder {
        private Team team;
        private Player player;
        private SeasonType seasonType;
        private int year;
        private int gamesPlayed;
        private BigDecimal mp;
        private BigDecimal per;
        private BigDecimal trueShootingPct;
        private BigDecimal threePointAttemptRate;
        private BigDecimal freeThrowAttemptRate;
        private BigDecimal offRebPct;
        private BigDecimal defRebPct;
        private BigDecimal totalRebPct;
        private BigDecimal assistPct;
        private BigDecimal stealPct;
        private BigDecimal blockPct;
        private BigDecimal turnOverPct;
        private BigDecimal usagePct;
        private BigDecimal offWinShares;
        private BigDecimal defWinShares;
        private BigDecimal winShares;
        private BigDecimal winSharesPer48;
        private BigDecimal offBoxPlusMinus;
        private BigDecimal defBoxPlusMinus;
        private BigDecimal boxPlusMinus;
        private BigDecimal valueOverReplacement;

        public Builder() {
        }

        public Builder setTeam(Team team) {
            this.team = team;
            return Builder.this;
        }

        public Builder setPlayer(Player player) {
            this.player = player;
            return Builder.this;
        }

        public Builder setSeasonType(SeasonType seasonType) {
            this.seasonType = seasonType;
            return Builder.this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return Builder.this;
        }

        public Builder setGamesPlayed(int gamesPlayed) {
            this.gamesPlayed = gamesPlayed;
            return Builder.this;
        }

        public Builder setMp(BigDecimal mp) {
            this.mp = mp;
            return Builder.this;
        }

        public Builder setPer(BigDecimal per) {
            this.per = per;
            return Builder.this;
        }

        public Builder setTrueShootingPct(BigDecimal trueShootingPct) {
            this.trueShootingPct = trueShootingPct;
            return Builder.this;
        }

        public Builder setThreePointAttemptRate(BigDecimal threePointAttemptRate) {
            this.threePointAttemptRate = threePointAttemptRate;
            return Builder.this;
        }

        public Builder setFreeThrowAttemptRate(BigDecimal freeThrowAttemptRate) {
            this.freeThrowAttemptRate = freeThrowAttemptRate;
            return Builder.this;
        }

        public Builder setOffRebPct(BigDecimal offRebPct) {
            this.offRebPct = offRebPct;
            return Builder.this;
        }

        public Builder setDefRebPct(BigDecimal defRebPct) {
            this.defRebPct = defRebPct;
            return Builder.this;
        }

        public Builder setTotalRebPct(BigDecimal totalRebPct) {
            this.totalRebPct = totalRebPct;
            return Builder.this;
        }

        public Builder setAssistPct(BigDecimal assistPct) {
            this.assistPct = assistPct;
            return Builder.this;
        }

        public Builder setStealPct(BigDecimal stealPct) {
            this.stealPct = stealPct;
            return Builder.this;
        }

        public Builder setBlockPct(BigDecimal blockPct) {
            this.blockPct = blockPct;
            return Builder.this;
        }

        public Builder setTurnOverPct(BigDecimal turnOverPct) {
            this.turnOverPct = turnOverPct;
            return Builder.this;
        }

        public Builder setUsagePct(BigDecimal usagePct) {
            this.usagePct = usagePct;
            return Builder.this;
        }

        public Builder setOffWinShares(BigDecimal offWinShares) {
            this.offWinShares = offWinShares;
            return Builder.this;
        }

        public Builder setDefWinShares(BigDecimal defWinShares) {
            this.defWinShares = defWinShares;
            return Builder.this;
        }

        public Builder setWinShares(BigDecimal winShares) {
            this.winShares = winShares;
            return Builder.this;
        }

        public Builder setWinSharesPer48(BigDecimal winSharesPer48) {
            this.winSharesPer48 = winSharesPer48;
            return Builder.this;
        }

        public Builder setOffBoxPlusMinus(BigDecimal offBoxPlusMinus) {
            this.offBoxPlusMinus = offBoxPlusMinus;
            return Builder.this;
        }

        public Builder setDefBoxPlusMinus(BigDecimal defBoxPlusMinus) {
            this.defBoxPlusMinus = defBoxPlusMinus;
            return Builder.this;
        }

        public Builder setBoxPlusMinus(BigDecimal boxPlusMinus) {
            this.boxPlusMinus = boxPlusMinus;
            return Builder.this;
        }

        public Builder setValueOverReplacement(BigDecimal valueOverReplacement) {
            this.valueOverReplacement = valueOverReplacement;
            return Builder.this;
        }

        public AdvancedStats build() {
            return new AdvancedStats(this);
        }
    }
    private AdvancedStats(Builder builder) {
        this.team = builder.team;
        this.player = builder.player;
        this.seasonType = builder.seasonType;
        this.year = builder.year;
        this.gamesPlayed = builder.gamesPlayed;
        this.mp = builder.mp;
        this.per = builder.per;
        this.trueShootingPct = builder.trueShootingPct;
        this.threePointAttemptRate = builder.threePointAttemptRate;
        this.freeThrowAttemptRate = builder.freeThrowAttemptRate;
        this.offRebPct = builder.offRebPct;
        this.defRebPct = builder.defRebPct;
        this.totalRebPct = builder.totalRebPct;
        this.assistPct = builder.assistPct;
        this.stealPct = builder.stealPct;
        this.blockPct = builder.blockPct;
        this.turnOverPct = builder.turnOverPct;
        this.usagePct = builder.usagePct;
        this.offWinShares = builder.offWinShares;
        this.defWinShares = builder.defWinShares;
        this.winShares = builder.winShares;
        this.winSharesPer48 = builder.winSharesPer48;
        this.offBoxPlusMinus = builder.offBoxPlusMinus;
        this.defBoxPlusMinus = builder.defBoxPlusMinus;
        this.boxPlusMinus = builder.boxPlusMinus;
        this.valueOverReplacement = builder.valueOverReplacement;
    }
}
