package com.example.collegefinalproject.models

data class College(
    val fed_sch_cd: String,
    val id: Int,
    val latest: Latest,
    val location: Location,
    val ope6_id: String,
    val ope8_id: String,
    val school: School
) {
    data class Latest(
        val academics: Academics,
        val admissions: Admissions,
        val aid: Aid,
        val cost: Cost,
        val programs: Programs,
        val student: Student
    ) {
        data class Academics(
            val program: Program,
            val program_available: ProgramAvailable,
            val program_percentage: ProgramPercentage,
            val program_reporter: ProgramReporter
        ) {
            data class Program(
                val assoc: Assoc,
                val bachelors: Bachelors,
                val certificate_lt_1_yr: CertificateLt1Yr,
                val certificate_lt_2_yr: CertificateLt2Yr,
                val certificate_lt_4_yr: CertificateLt4Yr,
                val degree: Degree,
                val degree_or_certificate: DegreeOrCertificate
            ) {
                data class Assoc(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )

                data class Bachelors(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )

                data class CertificateLt1Yr(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )

                data class CertificateLt2Yr(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )

                data class CertificateLt4Yr(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )

                data class Degree(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )

                data class DegreeOrCertificate(
                    val agriculture: Int,
                    val architecture: Int,
                    val biological: Int,
                    val business_marketing: Int,
                    val communication: Int,
                    val communications_technology: Int,
                    val computer: Int,
                    val construction: Int,
                    val education: Int,
                    val engineering: Int,
                    val engineering_technology: Int,
                    val english: Int,
                    val ethnic_cultural_gender: Int,
                    val family_consumer_science: Int,
                    val health: Int,
                    val history: Int,
                    val humanities: Int,
                    val language: Int,
                    val legal: Int,
                    val library: Int,
                    val mathematics: Int,
                    val mechanic_repair_technology: Int,
                    val military: Int,
                    val multidiscipline: Int,
                    val parks_recreation_fitness: Int,
                    val personal_culinary: Int,
                    val philosophy_religious: Int,
                    val physical_science: Int,
                    val precision_production: Int,
                    val psychology: Int,
                    val public_administration_social_service: Int,
                    val resources: Int,
                    val science_technology: Int,
                    val security_law_enforcement: Int,
                    val social_science: Int,
                    val theology_religious_vocation: Int,
                    val transportation: Int,
                    val visual_performing: Int
                )
            }

            data class ProgramAvailable(
                val assoc: Boolean,
                val assoc_or_bachelors: Boolean,
                val assoc_or_bachelors_or_certificate: Boolean,
                val bachelors: Boolean,
                val certificate: Boolean
            )

            data class ProgramPercentage(
                val agriculture: Double,
                val architecture: Double,
                val biological: Double,
                val business_marketing: Double,
                val communication: Double,
                val communications_technology: Double,
                val computer: Double,
                val construction: Double,
                val education: Double,
                val engineering: Double,
                val engineering_technology: Double,
                val english: Double,
                val ethnic_cultural_gender: Double,
                val family_consumer_science: Double,
                val health: Double,
                val history: Double,
                val humanities: Double,
                val language: Double,
                val legal: Double,
                val library: Double,
                val mathematics: Double,
                val mechanic_repair_technology: Double,
                val military: Double,
                val multidiscipline: Double,
                val parks_recreation_fitness: Double,
                val personal_culinary: Double,
                val philosophy_religious: Double,
                val physical_science: Double,
                val precision_production: Double,
                val psychology: Double,
                val public_administration_social_service: Double,
                val resources: Double,
                val science_technology: Double,
                val security_law_enforcement: Double,
                val social_science: Double,
                val theology_religious_vocation: Double,
                val transportation: Double,
                val visual_performing: Double
            )

            data class ProgramReporter(
                val program_1: Program1,
                val program_2: Program2,
                val program_3: Program3,
                val program_4: Program4,
                val program_5: Program5,
                val program_6: Program6,
                val programs_offered: Any
            ) {
                data class Program1(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val avg_month_completion: Any,
                        val code: Any,
                        val title: Any
                    )
                }

                data class Program2(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val avg_month_completion: Any,
                        val code: Any,
                        val title: Any
                    )
                }

                data class Program3(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val avg_month_completion: Any,
                        val code: Any,
                        val title: Any
                    )
                }

                data class Program4(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val avg_month_completion: Any,
                        val code: Any,
                        val title: Any
                    )
                }

                data class Program5(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val avg_month_completion: Any,
                        val code: Any,
                        val title: Any
                    )
                }

                data class Program6(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val avg_month_completion: Any,
                        val code: Any,
                        val title: Any
                    )
                }
            }
        }

        data class Admissions(
            val act_scores: ActScores,
            val admission_rate: AdmissionRate,
            val sat_scores: SatScores
        ) {
            data class ActScores(
                val `25th_percentile`: ThPercentile,
                val `75th_percentile`: ThPercentile,
                val midpoint: Midpoint
            ) {
                data class ThPercentile(
                    val cumulative: Int,
                    val english: Int,
                    val math: Int,
                    val writing: Any
                )

                data class Midpoint(
                    val cumulative: Int,
                    val english: Int,
                    val math: Int,
                    val writing: Any
                )
            }

            data class AdmissionRate(
                val by_ope_id: Double,
                val consumer_rate: Double,
                val overall: Double
            )

            data class SatScores(
                val `25th_percentile`: ThPercentile,
                val `75th_percentile`: ThPercentile,
                val average: Average,
                val midpoint: Midpoint
            ) {
                data class ThPercentile(
                    val critical_reading: Int,
                    val math: Int,
                    val writing: Int
                )

                data class Average(
                    val by_ope_id: Int,
                    val overall: Int
                )

                data class Midpoint(
                    val critical_reading: Int,
                    val math: Int,
                    val writing: Int
                )
            }
        }

        data class Aid(
            val cumulative_debt: CumulativeDebt,
            val federal_loan_rate: Double,
            val ftft_federal_loan_rate: Double,
            val ftft_federal_loan_rate_pooled: Double,
            val ftft_pell_grant_rate: Double,
            val ftft_pell_grant_rate_pooled: Double,
            val ftft_undergrads_pell_federal_loan_years: Int,
            val loan_principal: Int,
            val median_debt: MedianDebt,
            val median_debt_suppressed: MedianDebtSuppressed,
            val pell_grant_rate: Double,
            val plus_debt: PlusDebt,
            val plus_debt_suppressed: PlusDebtSuppressed,
            val plus_loan_pct_lower: Int,
            val plus_loan_pct_lower_pooled: Int,
            val plus_loan_pct_upper: Int,
            val plus_loan_pct_upper_pooled: Int,
            val plus_loan_pct_years: Int,
            val portfolio: Portfolio,
            val students_with_any_loan: Double
        ) {
            data class CumulativeDebt(
                val `10th_percentile`: Int,
                val `25th_percentile`: Int,
                val `75th_percentile`: Int,
                val `90th_percentile`: Int,
                val number: Int
            )

            data class MedianDebt(
                val completers: Completers,
                val dependent_students: Int,
                val female_students: Int,
                val first_generation_students: Int,
                val income: Income,
                val independent_students: Int,
                val male_students: Int,
                val no_pell_grant: Int,
                val non_first_generation_students: Int,
                val noncompleters: Int,
                val number: Number,
                val pell_grant: Int
            ) {
                data class Completers(
                    val monthly_payments: Double,
                    val overall: Int
                )

                data class Income(
                    val `0_30000`: Int,
                    val `30001_75000`: Int,
                    val greater_than_75000: Int
                )

                data class Number(
                    val completers: Int,
                    val dependent_students: Int,
                    val female_students: Int,
                    val first_generation_students: Int,
                    val income: Income,
                    val independent_students: Int,
                    val male_students: Int,
                    val no_pell_grant: Int,
                    val non_first_generation_students: Int,
                    val noncompleters: Int,
                    val overall: Int,
                    val pell_grant: Int
                ) {
                    data class Income(
                        val `0_30000`: Int,
                        val `30001_75000`: Int,
                        val greater_than_75000: Int
                    )
                }
            }

            data class MedianDebtSuppressed(
                val completers: Completers,
                val overall: Int
            ) {
                data class Completers(
                    val monthly_payments: Double,
                    val overall: Int
                )
            }

            data class PlusDebt(
                val all: All,
                val completers: Completers,
                val male: Male,
                val noncompleters: Noncompleters,
                val nostafford_any_school: NostaffordAnySchool,
                val nostafford_this_school: NostaffordThisSchool,
                val not_male: NotMale,
                val not_pell: NotPell,
                val pell: Pell,
                val stafford_any_school: StaffordAnySchool,
                val stafford_this_school: StaffordThisSchool
            ) {
                data class All(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class Completers(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int,
                        val median_payment: Double
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int,
                        val median_payment: Double
                    )
                }

                data class Male(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class Noncompleters(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class NostaffordAnySchool(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class NostaffordThisSchool(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class NotMale(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class NotPell(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class Pell(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class StaffordAnySchool(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }

                data class StaffordThisSchool(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val count: Int,
                        val median: Int
                    )

                    data class EvalInst(
                        val count: Int,
                        val median: Int
                    )
                }
            }

            data class PlusDebtSuppressed(
                val completers: Completers
            ) {
                data class Completers(
                    val all_inst: AllInst,
                    val eval_inst: EvalInst
                ) {
                    data class AllInst(
                        val median: Int,
                        val median_payment: Double
                    )

                    data class EvalInst(
                        val median: Int,
                        val median_payment: Double
                    )
                }
            }

            data class Portfolio(
                val direct_loans: DirectLoans,
                val grad_plus: GradPlus,
                val parent_plus: ParentPlus
            ) {
                data class DirectLoans(
                    val amount: Long,
                    val count: Int
                )

                data class GradPlus(
                    val amount: Long,
                    val count: Int
                )

                data class ParentPlus(
                    val amount: Long,
                    val count: Int
                )
            }
        }

        /**
        data class Completion(
            val `2_yr_completion`: YrCompletion,
            val `3_yr_completion`: YrCompletion,
            val `4_yr_completion`: YrCompletion,
            val `6_yr_completion`: YrCompletion,
            val `8_yr_completion`: YrCompletion,
            val completion_cohort_4yr_100nt: Int,
            val completion_cohort_4yr_150_2ormore: Int,
            val completion_cohort_4yr_150_aian: Int,
            val completion_cohort_4yr_150_aian_pre2010: Any,
            val completion_cohort_4yr_150_api_pre2010: Any,
            val completion_cohort_4yr_150_asian: Int,
            val completion_cohort_4yr_150_black: Int,
            val completion_cohort_4yr_150_black_pre2010: Any,
            val completion_cohort_4yr_150_hispanic: Int,
            val completion_cohort_4yr_150_hispanic_pre2010: Any,
            val completion_cohort_4yr_150_nhpi: Int,
            val completion_cohort_4yr_150_nonresident: CompletionCohort4yr150Nonresident,
            val completion_cohort_4yr_150_race: CompletionCohort4yr150Race,
            val completion_cohort_4yr_150_white: Int,
            val completion_cohort_4yr_150_white_pre2010: Any,
            val completion_cohort_4yr_150nt: Int,
            val completion_cohort_4yr_150nt_pooled: Int,
            val completion_cohort_4yr_200nt: Int,
            val completion_cohort_4yr_200nt_pooled: Int,
            val completion_cohort_four_year_100_pooled: Int,
            val completion_cohort_four_year_150_loan_nopell: Int,
            val completion_cohort_four_year_150_noloan_nopell: Int,
            val completion_cohort_four_year_150_pell: Int,
            val completion_cohort_less_than_4yr_100nt: Any,
            val completion_cohort_less_than_4yr_150_2ormore: Any,
            val completion_cohort_less_than_4yr_150_aian: Any,
            val completion_cohort_less_than_4yr_150_aian_pre2010: Any,
            val completion_cohort_less_than_4yr_150_api_pre2010: Any,
            val completion_cohort_less_than_4yr_150_asian: Any,
            val completion_cohort_less_than_4yr_150_black: Any,
            val completion_cohort_less_than_4yr_150_black_pre2010: Any,
            val completion_cohort_less_than_4yr_150_hispanic: Any,
            val completion_cohort_less_than_4yr_150_hispanic_pre2010: Any,
            val completion_cohort_less_than_4yr_150_nhpi: Any,
            val completion_cohort_less_than_4yr_150_nonresident: CompletionCohortLessThan4yr150Nonresident,
            val completion_cohort_less_than_4yr_150_race: CompletionCohortLessThan4yr150Race,
            val completion_cohort_less_than_4yr_150_white: Any,
            val completion_cohort_less_than_4yr_150_white_pre2010: Any,
            val completion_cohort_less_than_4yr_150nt: Any,
            val completion_cohort_less_than_4yr_150nt_pooled: Any,
            val completion_cohort_less_than_4yr_200nt: Any,
            val completion_cohort_less_than_4yr_200nt_pooled: Any,
            val completion_cohort_lt_four_year_100_pooled: Any,
            val completion_cohort_lt_four_year_150_loan_nopell: Any,
            val completion_cohort_lt_four_year_150_noloan_nopell: Any,
            val completion_cohort_lt_four_year_150_pell: Any,
            val completion_rate_4yr_100nt: Double,
            val completion_rate_4yr_150_2ormore: Double,
            val completion_rate_4yr_150_aian: Any,
            val completion_rate_4yr_150_aian_pre2010: Any,
            val completion_rate_4yr_150_api_pre2010: Any,
            val completion_rate_4yr_150_asian: Any,
            val completion_rate_4yr_150_black: Double,
            val completion_rate_4yr_150_black_pre2010: Any,
            val completion_rate_4yr_150_hispanic: Double,
            val completion_rate_4yr_150_hispanic_pre2010: Any,
            val completion_rate_4yr_150_nhpi: Int,
            val completion_rate_4yr_150_nonresident: CompletionRate4yr150Nonresident,
            val completion_rate_4yr_150_race: CompletionRate4yr150Race,
            val completion_rate_4yr_150_white: Double,
            val completion_rate_4yr_150_white_pre2010: Any,
            val completion_rate_4yr_150nt: Double,
            val completion_rate_4yr_150nt_pooled: Double,
            val completion_rate_4yr_200nt: Double,
            val completion_rate_4yr_200nt_pooled: Double,
            val completion_rate_four_year_100_pooled: Double,
            val completion_rate_four_year_150_loan_nopell: Double,
            val completion_rate_four_year_150_noloan_nopell: Double,
            val completion_rate_four_year_150_pell: Double,
            val completion_rate_l4yr_150_2ormore: Any,
            val completion_rate_l4yr_150_aian: Any,
            val completion_rate_l4yr_150_aian_pre2010: Any,
            val completion_rate_l4yr_150_api_pre2010: Any,
            val completion_rate_l4yr_150_asian: Any,
            val completion_rate_l4yr_150_black: Any,
            val completion_rate_l4yr_150_black_pre2010: Any,
            val completion_rate_l4yr_150_hispanic: Any,
            val completion_rate_l4yr_150_hispanic_pre2010: Any,
            val completion_rate_l4yr_150_nhpi: Any,
            val completion_rate_l4yr_150_nonresident: CompletionRateL4yr150Nonresident,
            val completion_rate_l4yr_150_race: CompletionRateL4yr150Race,
            val completion_rate_l4yr_150_white: Any,
            val completion_rate_l4yr_150_white_pre2010: Any,
            val completion_rate_less_than_4yr_100nt: Any,
            val completion_rate_less_than_4yr_150nt: Any,
            val completion_rate_less_than_4yr_150nt_pooled: Any,
            val completion_rate_less_than_4yr_200nt: Any,
            val completion_rate_less_than_4yr_200nt_pooled: Any,
            val completion_rate_lt_four_year_100_pooled: Any,
            val completion_rate_lt_four_year_150_loan_nopell: Any,
            val completion_rate_lt_four_year_150_noloan_nopell: Any,
            val completion_rate_lt_four_year_150_pell: Any,
            val consumer_rate: Double,
            val outcome_cohort: OutcomeCohort,
            val outcome_percentage: OutcomePercentage,
            val outcome_percentage_suppressed: OutcomePercentageSuppressed,
            val outcome_years: OutcomeYears,
            val pooled_yrs_used: Int,
            val pooled_yrs_used_100: Int,
            val pooled_yrs_used_200: Int,
            val rate_suppressed: RateSuppressed,
            val separation_date: SeparationDate,
            val title_iv: TitleIv,
            val transfer_rate: TransferRate,
            val transfer_rate_suppressed: TransferRateSuppressed
        ) {
            data class YrCompletion(
                val dependent_students: Int,
                val female_students: Int,
                val first_generation_students: Int,
                val high_income: Int,
                val independent_students: Int,
                val loan_students: Int,
                val low_income: Int,
                val male_students: Int,
                val middle_income: Int,
                val no_first_generation_students: Int,
                val no_loan_students: Int,
                val no_pell_grant: Int,
                val overall: Int,
                val pell_grant: Int
            )

            data class CompletionCohort4yr150Nonresident(
                val alien: Int
            )

            data class CompletionCohort4yr150Race(
                val unknown: Int
            )

            data class CompletionCohortLessThan4yr150Nonresident(
                val alien: Any
            )

            data class CompletionCohortLessThan4yr150Race(
                val unknown: Any
            )

            data class CompletionRate4yr150Nonresident(
                val alien: Any
            )

            data class CompletionRate4yr150Race(
                val unknown: Double
            )

            data class CompletionRateL4yr150Nonresident(
                val alien: Any
            )

            data class CompletionRateL4yr150Race(
                val unknown: Any
            )

            data class OutcomeCohort(
                val full_time: FullTime,
                val part_time: PartTime
            ) {
                data class FullTime(
                    val first_time: FirstTime,
                    val not_first_time: NotFirstTime
                ) {
                    data class FirstTime(
                        val `6yr`: Int,
                        val `6yr_pooled`: Int,
                        val `8yr`: Int,
                        val `8yr_pooled`: Int
                    )

                    data class NotFirstTime(
                        val `6yr`: Int,
                        val `6yr_pooled`: Int,
                        val `8yr`: Int,
                        val `8yr_pooled`: Int
                    )
                }

                data class PartTime(
                    val first_time: FirstTime,
                    val not_first_time: NotFirstTime
                ) {
                    data class FirstTime(
                        val `6yr`: Int,
                        val `6yr_pooled`: Int,
                        val `8yr`: Int,
                        val `8yr_pooled`: Int
                    )

                    data class NotFirstTime(
                        val `6yr`: Int,
                        val `6yr_pooled`: Int,
                        val `8yr`: Int,
                        val `8yr_pooled`: Int
                    )
                }
            }
            */

        /**
            data class OutcomePercentage(
                val all_students: AllStudents,
                val first_time: FirstTime,
                val full_time: FullTime,
                val not_first_time: NotFirstTime,
                val part_time: PartTime
            ) {
                data class AllStudents(
                    val `8yr`: Yr
                ) {
                    data class Yr(
                        val award: Double,
                        val still_enrolled: Double,
                        val transfer: Double,
                        val unknown: Double
                    )
                }

                data class FirstTime(
                    val `8yr`: Yr
                ) {
                    data class Yr(
                        val award: Double,
                        val still_enrolled: Double,
                        val transfer: Double,
                        val unknown: Double
                    )
                }

                data class FullTime(
                    val `8yr`: Yr,
                    val first_time: FirstTime,
                    val not_first_time: NotFirstTime
                ) {
                    data class Yr(
                        val award: Double,
                        val still_enrolled: Double,
                        val transfer: Double,
                        val unknown: Double
                    )

                    data class FirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award: Double,
                            val award_pooled: Double,
                            val still_enrolled: Double?,
                            val still_enrolled_pooled: Double?,
                            val transfer: Double?,
                            val transfer_pooled: Double?,
                            val unknown: Double?,
                            val unknown_pooled: Double?
                        )
                    }

                    data class NotFirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award: Double,
                            val award_pooled: Double,
                            val still_enrolled: Double?,
                            val still_enrolled_pooled: Double?,
                            val transfer: Double?,
                            val transfer_pooled: Double?,
                            val unknown: Double?,
                            val unknown_pooled: Double?
                        )
                    }
                }
            */

            /**
                data class NotFirstTime(
                    val `8yr`: Yr
                ) {
                    data class Yr(
                        val award: Double,
                        val still_enrolled: Double,
                        val transfer: Double,
                        val unknown: Double
                    )
                }

                data class PartTime(
                    val `8yr`: Yr,
                    val first_time: FirstTime,
                    val not_first_time: NotFirstTime
                ) {
                    data class Yr(
                        val award: Double,
                        val still_enrolled: Double,
                        val transfer: Double,
                        val unknown: Double
                    )

                    data class FirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award: Double,
                            val award_pooled: Double,
                            val still_enrolled: Double?,
                            val still_enrolled_pooled: Double?,
                            val transfer: Double?,
                            val transfer_pooled: Double?,
                            val unknown: Double?,
                            val unknown_pooled: Double?
                        )
                    }

                    data class NotFirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award: Double,
                            val award_pooled: Double,
                            val still_enrolled: Int?,
                            val still_enrolled_pooled: Double?,
                            val transfer: Double?,
                            val transfer_pooled: Double?,
                            val unknown: Double?,
                            val unknown_pooled: Double?
                        )
                    }
                }
            }
            */

            /**
            data class OutcomePercentageSuppressed(
                val all_students: AllStudents,
                val first_time: FirstTime,
                val full_time: FullTime,
                val not_first_time: NotFirstTime,
                val part_time: PartTime
            ) {
                data class AllStudents(
                    val `8yr`: Yr
                ) {
                    data class Yr(
                        val award_pooled: Double,
                        val still_enrolled_pooled: Double,
                        val transfer_pooled: Double,
                        val unknown_pooled: Double
                    )
                }

                data class FirstTime(
                    val `8yr`: Yr
                ) {
                    data class Yr(
                        val award_pooled: Double,
                        val still_enrolled_pooled: Double,
                        val transfer_pooled: Double,
                        val unknown_pooled: Double
                    )
                }

                data class FullTime(
                    val `8yr`: Yr,
                    val first_time: FirstTime,
                    val not_first_time: NotFirstTime
                ) {
                    data class Yr(
                        val award_pooled: Double,
                        val still_enrolled_pooled: Double,
                        val transfer_pooled: Double,
                        val unknown_pooled: Double
                    )

                    data class FirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award_pooled: Double,
                            val still_enrolled_pooled: Double?,
                            val transfer_pooled: Double?,
                            val unknown_pooled: Double?
                        )
                    }

                    data class NotFirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award_pooled: Double,
                            val still_enrolled_pooled: Double?,
                            val transfer_pooled: Double?,
                            val unknown_pooled: Double?
                        )
                    }
                }

                data class NotFirstTime(
                    val `8yr`: Yr
                ) {
                    data class Yr(
                        val award_pooled: Double,
                        val still_enrolled_pooled: Double,
                        val transfer_pooled: Double,
                        val unknown_pooled: Double
                    )
                }

                data class PartTime(
                    val `8yr`: Yr,
                    val first_time: FirstTime,
                    val not_first_time: NotFirstTime
                ) {
                    data class Yr(
                        val award_pooled: Double,
                        val still_enrolled_pooled: Double,
                        val transfer_pooled: Double,
                        val unknown_pooled: Double
                    )

                    data class FirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award_pooled: Double,
                            val still_enrolled_pooled: Double?,
                            val transfer_pooled: Double?,
                            val unknown_pooled: Double?
                        )
                    }

                    data class NotFirstTime(
                        val `6yr`: Yr,
                        val `8yr`: Yr
                    ) {

                        data class Yr(
                            val award_pooled: Double,
                            val still_enrolled_pooled: Double?,
                            val transfer_pooled: Double?,
                            val unknown_pooled: Double?
                        )
                    }
                }
            }

            data class OutcomeYears(
                val full_time: FullTime,
                val om_all_students: Int,
                val om_first_time: Int,
                val om_full_time: Int,
                val om_not_first_time: Int,
                val om_part_time: Int,
                val part_time: PartTime
            ) {
                data class FullTime(
                    val first_time: Int,
                    val not_first_time: Int
                )

                data class PartTime(
                    val first_time: Int,
                    val not_first_time: Int
                )
            }
            */

            /**
            data class RateSuppressed(
                val four_year: Double,
                val four_year_100_pooled: Double,
                val four_year_200percent: Double,
                val lt_four_year: Any,
                val lt_four_year_100_pooled: Any,
                val lt_four_year_150percent: Any,
                val overall: Double
            )

            data class SeparationDate(
                val median: String,
                val number: Int
            )

            data class TitleIv(
                val completed_by: CompletedBy,
                val depend: Depend,
                val died_by: DiedBy,
                val female: Female,
                val first_gen: FirstGen,
                val high_inc: HighInc,
                val independ: Independ,
                val loan_recip: LoanRecip,
                val low_inc: LowInc,
                val male: Male,
                val mid_inc: MidInc,
                val no_loan: NoLoan,
                val no_pell: NoPell,
                val not_first_gen: NotFirstGen,
                val pell_recip: PellRecip,
                val still_enrolled_by: StillEnrolledBy,
                val transf_completed_2yr_by: TransfCompleted2yrBy,
                val transf_completed_4yr_by: TransfCompleted4yrBy,
                val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                val transf_unknown_2yr_by: TransfUnknown2yrBy,
                val transf_unknown_4yr_by: TransfUnknown4yrBy,
                val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                val unknown_by: UnknownBy,
                val withdrawn_by: WithdrawnBy
            ) {
                data class CompletedBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class Depend(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class DiedBy(
                    val `2yrs`: Any,
                    val `3yrs`: Any,
                    val `4yrs`: Any,
                    val `6yrs`: Any,
                    val `8yrs`: Any
                )

                data class Female(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class FirstGen(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class HighInc(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class Independ(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }
                */

                /**
                data class LoanRecip(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class UnknownBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )
                }

                data class LowInc(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class Male(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class MidInc(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class NoLoan(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class UnknownBy(
                        val `2yrs`: Double,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )
                }

                data class NoPell(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class NotFirstGen(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class PellRecip(
                    val completed_by: CompletedBy,
                    val died_by: DiedBy,
                    val still_enrolled_by: StillEnrolledBy,
                    val transf_completed_2yr_by: TransfCompleted2yrBy,
                    val transf_completed_4yr_by: TransfCompleted4yrBy,
                    val transf_still_enrolled_2yr_by: TransfStillEnrolled2yrBy,
                    val transf_still_enrolled_4yr_by: TransfStillEnrolled4yrBy,
                    val transf_unknown_2yr_by: TransfUnknown2yrBy,
                    val transf_unknown_4yr_by: TransfUnknown4yrBy,
                    val transf_withdrawn_2yr_by: TransfWithdrawn2yrBy,
                    val transf_withdrawn_4yr_by: TransfWithdrawn4yrBy,
                    val unknown_by: UnknownBy,
                    val withdrawn_by: WithdrawnBy
                ) {
                    data class CompletedBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class DiedBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class StillEnrolledBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfCompleted4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class TransfStillEnrolled2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfStillEnrolled4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown2yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfUnknown4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class TransfWithdrawn2yrBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Any,
                        val `8yrs`: Double
                    )

                    data class TransfWithdrawn4yrBy(
                        val `2yrs`: Any,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )

                    data class UnknownBy(
                        val `2yrs`: Any,
                        val `3yrs`: Any,
                        val `4yrs`: Any,
                        val `6yrs`: Any,
                        val `8yrs`: Any
                    )

                    data class WithdrawnBy(
                        val `2yrs`: Double,
                        val `3yrs`: Double,
                        val `4yrs`: Double,
                        val `6yrs`: Double,
                        val `8yrs`: Double
                    )
                }

                data class StillEnrolledBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class TransfCompleted2yrBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class TransfCompleted4yrBy(
                    val `2yrs`: Any,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class TransfStillEnrolled2yrBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class TransfStillEnrolled4yrBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class TransfUnknown2yrBy(
                    val `2yrs`: Any,
                    val `3yrs`: Any,
                    val `4yrs`: Any,
                    val `6yrs`: Any,
                    val `8yrs`: Double
                )

                data class TransfUnknown4yrBy(
                    val `2yrs`: Any,
                    val `3yrs`: Any,
                    val `4yrs`: Any,
                    val `6yrs`: Any,
                    val `8yrs`: Any
                )

                data class TransfWithdrawn2yrBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class TransfWithdrawn4yrBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class UnknownBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Any,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )

                data class WithdrawnBy(
                    val `2yrs`: Double,
                    val `3yrs`: Double,
                    val `4yrs`: Double,
                    val `6yrs`: Double,
                    val `8yrs`: Double
                )
            }

            data class TransferRate(
                val `4yr`: Yr,
                val cohort_4yr: Cohort4yr,
                val cohort_less_than_4yr: CohortLessThan4yr,
                val less_than_4yr: LessThan4yr
            ) {
                data class Yr(
                    val full_time: Double,
                    val full_time_pooled: Double
                )

                data class Cohort4yr(
                    val full_time: Int,
                    val full_time_pooled: Int
                )

                data class CohortLessThan4yr(
                    val full_time: Any,
                    val full_time_pooled: Any
                )

                data class LessThan4yr(
                    val full_time: Any,
                    val full_time_pooled: Any
                )
            }

            data class TransferRateSuppressed(
                val `4yr`: Yr,
                val less_than_4yr: LessThan4yr
            ) {
                data class Yr(
                    val full_time_pooled: Double
                )

                data class LessThan4yr(
                    val full_time_pooled: Any
                )
            }
        }
        */
        data class Cost(
            val attendance: Attendance,
            val avg_net_price: AvgNetPrice,
            val net_price: NetPrice,
            val program_reporter: ProgramReporter,
            val title_iv: TitleIv,
            val tuition: Tuition
        ) {
            data class Attendance(
                val academic_year: Int,
                val program_year: Any
            )

            data class AvgNetPrice(
                val other_academic_year: Any,
                val overall: Int,
                val `private`: Any,
                val program_year: Any,
                val `public`: Int
            )

            data class NetPrice(
                val consumer: Consumer,
                val other_acad_calendar: OtherAcadCalendar,
                val `private`: Private,
                val program_reporter: ProgramReporter,
                val `public`: Public
            ) {
                data class Consumer(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Int,
                        val `0-48000`: Int,
                        val `110001-plus`: Int,
                        val `30001-48000`: Int,
                        val `30001-75000`: Int,
                        val `48001-75000`: Int,
                        val `75000-plus`: Int,
                        val `750001-111000`: Int
                    )
                }

                data class OtherAcadCalendar(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Any,
                        val `0-48000`: Any,
                        val `110001-plus`: Any,
                        val `30001-48000`: Any,
                        val `30001-75000`: Any,
                        val `48001-75000`: Any,
                        val `75000-plus`: Any,
                        val `75001-110000`: Any
                    )
                }

                data class Private(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Any,
                        val `0-48000`: Any,
                        val `110001-plus`: Any,
                        val `30001-48000`: Any,
                        val `30001-75000`: Any,
                        val `48001-75000`: Any,
                        val `75000-plus`: Any,
                        val `75001-110000`: Any
                    )
                }

                data class ProgramReporter(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Any,
                        val `0-48000`: Any,
                        val `110001-plus`: Any,
                        val `30001-48000`: Any,
                        val `30001-75000`: Any,
                        val `48001-75000`: Any,
                        val `75000-plus`: Any,
                        val `75001-110000`: Any
                    )
                }

                data class Public(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Int,
                        val `0-48000`: Int,
                        val `110001-plus`: Int,
                        val `30001-48000`: Int,
                        val `30001-75000`: Int,
                        val `48001-75000`: Int,
                        val `75000-plus`: Int,
                        val `75001-110000`: Int
                    )
                }
            }

            data class ProgramReporter(
                val program_1: Program1,
                val program_2: Program2,
                val program_3: Program3,
                val program_4: Program4,
                val program_5: Program5,
                val program_6: Program6
            ) {
                data class Program1(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val annualized: Any,
                        val full_program: Any
                    )
                }

                data class Program2(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val annualized: Any,
                        val full_program: Any
                    )
                }

                data class Program3(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val annualized: Any,
                        val full_program: Any
                    )
                }

                data class Program4(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val annualized: Any,
                        val full_program: Any
                    )
                }

                data class Program5(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val annualized: Any,
                        val full_program: Any
                    )
                }

                data class Program6(
                    val cip_6_digit: Cip6Digit
                ) {
                    data class Cip6Digit(
                        val annualized: Any,
                        val full_program: Any
                    )
                }
            }

            data class TitleIv(
                val academic_year: Any,
                val other_acad_calendar: OtherAcadCalendar,
                val `private`: Private,
                val program_reporter: ProgramReporter,
                val program_year: Any,
                val `public`: Public
            ) {
                data class OtherAcadCalendar(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Any,
                        val `110001-plus`: Any,
                        val `30001-48000`: Any,
                        val `48001-75000`: Any,
                        val `75001-110000`: Any
                    )
                }

                data class Private(
                    val all: Any,
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Any,
                        val `110001-plus`: Any,
                        val `30001-48000`: Any,
                        val `48001-75000`: Any,
                        val `75001-110000`: Any
                    )
                }

                data class ProgramReporter(
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Any,
                        val `110001-plus`: Any,
                        val `30001-48000`: Any,
                        val `48001-75000`: Any,
                        val `75001-110000`: Any
                    )
                }

                data class Public(
                    val all: Int,
                    val by_income_level: ByIncomeLevel
                ) {
                    data class ByIncomeLevel(
                        val `0-30000`: Int,
                        val `110001-plus`: Int,
                        val `30001-48000`: Int,
                        val `48001-75000`: Int,
                        val `75001-110000`: Int
                    )
                }
            }

            data class Tuition(
                val in_state: Int,
                val out_of_state: Int,
                val program_year: Any
            )
        }

        data class Earnings(
            val `10_yrs_after_entry`: YrsAfterEntry,
            val `3_yrs_after_completion`: YrsAfterCompletion,
            val `6_yrs_after_entry`: YrsAfterEntry,
            val `7_yrs_after_entry`: YrsAfterEntry,
            val `8_yrs_after_entry`: YrsAfterEntry,
            val `9_yrs_after_entry`: YrsAfterEntry,
            val student_count: Any
        ) {
            data class YrsAfterEntry(
                val female_students: Int?,
                val independent_students: Int?,
                val male_students: Int?,
                val mean_earnings: MeanEarnings?,
                val median: Int?,
                val not_working_not_enrolled: NotWorkingNotEnrolled?,
                val percent_greater_than_25000: Double?,
                val percent_greater_than_28000: Double?,
                val working_not_enrolled: WorkingNotEnrolled?
            ) {
                data class MeanEarnings(
                    val dependent_students: Int?,
                    val dependent_students_lowest_tercile: Int?,
                    val female_students: Int?,
                    val highest_tercile: Int?,
                    val independent_students: Int?,
                    val lowest_tercile: Int?,
                    val male_students: Int?,
                    val middle_tercile: Int?
                )

                data class NotWorkingNotEnrolled(
                    val overall: Int?
                )

                data class WorkingNotEnrolled(
                    val dependent_students: Int?,
                    val dependent_students_lowest_tercile: Int?,
                    val earnings_percentile: EarningsPercentile?,
                    val income: Income?,
                    val mean_earnings: Int?,
                    val overall: Int?,
                    val std_dev: Int?
                ) {
                    data class EarningsPercentile(
                        val `10`: Int?,
                        val `25`: Int?,
                        val `75`: Int?,
                        val `90`: Int?
                    )

                    data class Income(
                        val highest_tercile: Int?,
                        val lowest_tercile: Int?,
                        val middle_tercile: Int?
                    )
                }
            }

            data class YrsAfterCompletion(
                val not_working_not_enrolled: NotWorkingNotEnrolled,
                val overall_count_over_poverty_line: Int,
                val working_not_enrolled: WorkingNotEnrolled
            ) {
                data class NotWorkingNotEnrolled(
                    val overall_count: Int
                )

                data class WorkingNotEnrolled(
                    val overall_count: Int
                )
            }
        }

        data class Programs(
            val cip_4_digit: List<Cip4Digit>
        ) {
            data class Cip4Digit(
                val code: String,
                val counts: Counts,
                val credential: Credential,
                val debt: Debt,
                val earnings: Earnings,
                val ope6_id: String,
                val repayment: Repayment,
                val school: School,
                val title: String,
                val unit_id: Int
            ) {
                data class Counts(
                    val ipeds_awards1: Any,
                    val ipeds_awards2: Any
                )

                data class Credential(
                    val level: Int,
                    val title: String
                )

                data class Debt(
                    val parent_plus: ParentPlus,
                    val staff_grad_plus: StaffGradPlus
                ) {
                    data class ParentPlus(
                        val all: All,
                        val male: Male,
                        val not_male: NotMale,
                        val not_pell: NotPell,
                        val pell: Pell
                    ) {
                        data class All(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any,
                                val median_payment: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any,
                                val median_payment: Any
                            )
                        }

                        data class Male(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }

                        data class NotMale(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }

                        data class NotPell(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }

                        data class Pell(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }
                    }

                    data class StaffGradPlus(
                        val all: All,
                        val male: Male,
                        val not_male: NotMale,
                        val not_pell: NotPell,
                        val pell: Pell
                    ) {
                        data class All(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any,
                                val median_payment: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any,
                                val median_payment: Any
                            )
                        }

                        data class Male(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }

                        data class NotMale(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }

                        data class NotPell(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }

                        data class Pell(
                            val all_inst: AllInst,
                            val eval_inst: EvalInst
                        ) {
                            data class AllInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )

                            data class EvalInst(
                                val average: Any,
                                val count: Any,
                                val median: Any
                            )
                        }
                    }
                }

                /**
                data class Earnings(
                    val highest: Highest
                ) {
                    data class Highest(
                        val `1_yr`: Yr,
                        val `2_yr`: Yr
                    ) {
                        data class Yr(
                            val not_working_not_enrolled: NotWorkingNotEnrolled?,
                            val overall_count_over_poverty_line: Any?,
                            val overall_median_earnings: Any?,
                            val working_not_enrolled: WorkingNotEnrolled?
                        ) {
                            data class NotWorkingNotEnrolled(
                                val overall_count: Any?
                            )

                            data class WorkingNotEnrolled(
                                val overall_count: Any?
                            )
                        }
                    }
                }
                */

                data class Repayment(
                    val `2_yr_bb_fed_comp`: YrBbFedComp
                ) {
                    data class YrBbFedComp(
                        val count: Any,
                        val default: Any,
                        val deferment: Any,
                        val delinquent: Any,
                        val discharge: Any,
                        val forbearance: Any,
                        val fullypaid: Any,
                        val makingprogress: Any,
                        val noprogress: Any
                    )
                }

                data class School(
                    val main_campus: Int,
                    val name: String,
                    val type: String
                )
            }
        }
        /**
        data class Repayment(
            val `10_yr_db_fed_repayment`: YrDbFedRepayment,
            val `10_yr_db_pp_repayment`: YrDbPpRepayment,
            val `1_yr_bb_fed_repayment`: YrBbFedRepayment,
            val `1_yr_bb_pp_repayment`: YrBbPpRepayment,
            val `1_yr_db_fed_repayment`: YrDbFedRepayment,
            val `1_yr_db_pp_repayment`: YrDbPpRepayment,
            val `1_yr_repayment`: YrRepayment,
            val `20_yr_db_fed_repayment`: YrDbFedRepayment,
            val `20_yr_db_pp_repayment`: YrDbPpRepayment,
            val `2_yr_bb_fed_repayment`: YrBbFedRepayment,
            val `2_yr_bb_fed_repayment_suppressed`: YrBbFedRepaymentSuppressed,
            val `2_yr_bb_pp_repayment`: YrBbPpRepayment,
            val `2_yr_default_rate`: Double,
            val `2_yr_default_rate_denom`: Int,
            val `3_yr_default_rate`: Double,
            val `3_yr_default_rate_denom`: Int,
            val `3_yr_repayment`: YrRepayment,
            val `3_yr_repayment_suppressed`: YrRepaymentSuppressed,
            val `4_yr_db_fed_repayment`: YrDbFedRepayment,
            val `4_yr_db_pp_repayment`: YrDbPpRepayment,
            val `5_yr_db_fed_repayment`: YrDbFedRepayment,
            val `5_yr_db_pp_repayment`: YrDbPpRepayment,
            val `5_yr_repayment`: YrRepayment,
            val `7_yr_repayment`: YrRepayment,
            val repayment_cohort: RepaymentCohort,
            val repayment_date: RepaymentDate
        ) {

            data class YrBbFedRepayment(
                val gr: Gr,
                val grcomp: College.Latest.Repayment.YrBbFedRepayment.Grcomp,
                val grnocomp: College.Latest.Repayment.YrBbFedRepayment.Grnocomp,
                val ug: Ug,
                val ugcomp: Ugcomp,
                val ugnocomp: Ugnocomp,
                val ugunkcomp: Ugunkcomp
            ) {
                data class Gr(
                    val count: Int,
                    val default: Any,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )

                data class Ug(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Double,
                    val forbearance: Double,
                    val fullypaid: Double,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugcomp(
                    val count: Int,
                    val default: Any,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )

                data class Ugnocomp(
                    val count: Int,
                    val default: Any,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugunkcomp(
                    val count: Int,
                    val default: Any,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )
            }

            data class YrDbFedRepayment(
                val gr: Gr,
                val gr_completer: GrCompleter,
                val gr_noncompleter: GrNoncompleter,
                val ug: Ug,
                val ug_completer: UgCompleter,
                val ug_completer_unknown: UgCompleterUnknown,
                val ug_noncompleter: UgNoncompleter
            ) {
                data class Gr(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class GrCompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class GrNoncompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleterUnknown(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgNoncompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrDbPpRepayment(
                val ug: Ug,
                val ug_completer: UgCompleter,
                val ug_completer_unknown: UgCompleterUnknown,
                val ug_noncompleter: UgNoncompleter
            ) {
                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleterUnknown(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgNoncompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrRepayment(
                val completers: Int,
                val completers_rate: Double,
                val dependent_students: Int,
                val dependent_students_rate: Double,
                val female_students: Int,
                val female_students_rate: Double,
                val first_generation_students: Int,
                val first_generation_students_rate: Double,
                val high_income: Int,
                val income: Income,
                val independent_students: Int,
                val independent_students_rate: Double,
                val low_income: Int,
                val male_students: Int,
                val male_students_rate: Double,
                val middle_income: Int,
                val no_pell_grant: Int,
                val no_pell_grant_rate: Double,
                val non_first_generation_students: Int,
                val non_first_generation_students_rate: Double,
                val noncompleters: Int,
                val noncompleters_rate: Double,
                val overall: Int,
                val pell_grant: Int,
                val pell_grant_rate: Double
            ) {
                data class Income(
                    val `0_30000`: Double,
                    val `30000_75000`: Double,
                    val greater_than_75000: Double
                )
            }

            data class YrDbFedRepayment(
                val gr: Gr,
                val ug: Ug
            ) {
                data class Gr(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrDbPpRepayment(
                val ug: Ug
            ) {
                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrBbFedRepayment(
                val gr: Gr,
                val grcomp: Grcomp,
                val grnocomp: Grnocomp,
                val ug: Ug,
                val ugcomp: Ugcomp,
                val ugnocomp: Ugnocomp,
                val ugunkcomp: Ugunkcomp
            ) {
                data class Gr(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Grcomp(
                    val count: Int,
                    val default: Any,
                    val deferment: Any,
                    val delinquent: Any,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )

                data class Grnocomp(
                    val count: Int,
                    val default: Any,
                    val deferment: Any,
                    val delinquent: Any,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )

                data class Ug(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Double,
                    val forbearance: Double,
                    val fullypaid: Double,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugcomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugnocomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Any,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Double,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugunkcomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Any,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Double,
                    val noprogress: Double
                )
            }

            data class YrBbFedRepaymentSuppressed(
                val ug: Ug,
                val ugcomp: Ugcomp
            ) {
                data class Ug(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Double,
                    val forbearance: Double,
                    val fullypaid: Double,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugcomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Double,
                    val noprogress: Double
                )
            }

            data class YrBbPpRepayment(
                val ug: Ug,
                val ugcomp: Ugcomp,
                val ugnocomp: Ugnocomp,
                val ugunkcomp: Ugunkcomp
            ) {
                data class Ug(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Double,
                    val forbearance: Double,
                    val fullypaid: Double,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugcomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Any,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Double,
                    val noprogress: Double
                )

                data class Ugnocomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Double,
                    val discharge: Double,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )

                data class Ugunkcomp(
                    val count: Int,
                    val default: Double,
                    val deferment: Double,
                    val delinquent: Any,
                    val discharge: Any,
                    val forbearance: Double,
                    val fullypaid: Any,
                    val makingprogress: Any,
                    val noprogress: Double
                )
            }

            data class YrRepayment(
                val completers: Int,
                val completers_rate: Double,
                val dependent_students: Int,
                val dependent_students_rate: Double,
                val female_students: Int,
                val female_students_rate: Double,
                val first_generation_students: Int,
                val first_generation_students_rate: Double,
                val high_income: Int,
                val income: Income,
                val independent_students: Int,
                val independent_students_rate: Double,
                val low_income: Int,
                val male_students: Int,
                val male_students_rate: Double,
                val middle_income: Int,
                val no_pell_grant: Int,
                val no_pell_grant_rate: Double,
                val non_first_generation_students: Int,
                val non_first_generation_students_rate: Double,
                val noncompleters: Int,
                val noncompleters_rate: Double,
                val overall: Int,
                val pell_grant: Int,
                val pell_grant_rate: Double
            ) {
                data class Income(
                    val `0_30000`: Double,
                    val `30000_75000`: Double,
                    val greater_than_75000: Double
                )
            }

            data class YrRepaymentSuppressed(
                val completers: Double,
                val dependent_students: Double,
                val female_students: Double,
                val first_generation_students: Double,
                val income: Income,
                val independent_students: Double,
                val male_students: Double,
                val no_pell_grant: Double,
                val non_completers: Double,
                val non_first_generation_students: Double,
                val overall: Double,
                val pell_grant: Double
            ) {
                data class Income(
                    val high_income: Double,
                    val low_income: Double,
                    val middle_income: Double
                )
            }

            data class YrDbFedRepayment(
                val gr: Gr,
                val ug: Ug,
                val ug_completer: UgCompleter,
                val ug_completer_unknown: UgCompleterUnknown,
                val ug_noncompleter: UgNoncompleter
            ) {
                data class Gr(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleterUnknown(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgNoncompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrDbPpRepayment(
                val ug: Ug,
                val ug_completer: UgCompleter,
                val ug_completer_unknown: UgCompleterUnknown,
                val ug_noncompleter: UgNoncompleter
            ) {
                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgCompleterUnknown(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class UgNoncompleter(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrDbFedRepayment(
                val gr: Gr,
                val ug: Ug
            ) {
                data class Gr(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )

                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrDbPpRepayment(
                val ug: Ug
            ) {
                data class Ug(
                    val count: Int,
                    val denominator: Int,
                    val numerator: Int,
                    val rate: Double
                )
            }

            data class YrRepayment(
                val completers: Int,
                val completers_rate: Double,
                val dependent_students: Int,
                val dependent_students_rate: Double,
                val female_students: Int,
                val female_students_rate: Double,
                val first_generation_students: Int,
                val first_generation_students_rate: Double,
                val high_income: Int,
                val income: Income,
                val independent_students: Int,
                val independent_students_rate: Double,
                val low_income: Int,
                val male_students: Int,
                val male_students_rate: Double,
                val middle_income: Int,
                val no_pell_grant: Int,
                val no_pell_grant_rate: Double,
                val non_first_generation_students: Int,
                val non_first_generation_students_rate: Double,
                val noncompleters: Int,
                val noncompleters_rate: Double,
                val overall: Int,
                val pell_grant: Int,
                val pell_grant_rate: Double
            ) {
                data class Income(
                    val `0_30000`: Double,
                    val `30000_75000`: Double,
                    val greater_than_75000: Double
                )
            }

            data class YrRepayment(
                val completers: Int,
                val completers_rate: Double,
                val dependent_students: Int,
                val dependent_students_rate: Double,
                val female_students: Int,
                val female_students_rate: Double,
                val first_generation_students: Int,
                val first_generation_students_rate: Double,
                val high_income: Int,
                val income: Income,
                val independent_students: Int,
                val independent_students_rate: Double,
                val low_income: Int,
                val male_students: Int,
                val male_students_rate: Double,
                val middle_income: Int,
                val no_pell_grant: Int,
                val no_pell_grant_rate: Double,
                val non_first_generation_students: Int,
                val non_first_generation_students_rate: Double,
                val noncompleters: Int,
                val noncompleters_rate: Double,
                val overall: Int,
                val pell_grant: Int,
                val pell_grant_rate: Double
            ) {
                data class Income(
                    val `0_30000`: Double,
                    val `30000_75000`: Double,
                    val greater_than_75000: Double
                )
            }

            data class RepaymentCohort(
                val `1_year_declining_balance`: Double,
                val `3_year_declining_balance`: Double,
                val `5_year_declining_balance`: Double,
                val `7_year_declining_balance`: Double
            )

            data class RepaymentDate(
                val median: String,
                val number: Int
            )
        }
        */
        data class Student(
            val FAFSA_applications: Int,
            val avg_dependent_income: AvgDependentIncome,
            val avg_independent_income: AvgIndependentIncome,
            val demographics: Demographics,
            val enrollment: Enrollment,
            val fafsa_sent: FafsaSent,
            val family_income: FamilyIncome,
            val ftft_undergrads_with_pell_grant_or_federal_student_loan: Int,
            val ftft_undergrads_with_pell_grant_or_federal_student_loan_pooled: Int,
            val grad_students: Int,
            val parents_education_level: Int,
            val part_time_share: Double,
            val part_time_share_2000: Any,
            val retention_rate: RetentionRate,
            val retention_rate_suppressed: RetentionRateSuppressed,
            val share_25_older: Double,
            val share_dependent_highincome: ShareDependentHighincome,
            val share_dependent_lowincome: ShareDependentLowincome,
            val share_dependent_middleincome: ShareDependentMiddleincome,
            val share_first: ShareFirst,
            val share_firstgeneration: Double,
            val share_firstgeneration_parents: ShareFirstgenerationParents,
            val share_highincome: ShareHighincome,
            val share_independent_highincome: ShareIndependentHighincome,
            val share_independent_lowincome: ShareIndependentLowincome,
            val share_independent_middleincome: ShareIndependentMiddleincome,
            val share_independent_students: Double,
            val share_lowincome: ShareLowincome,
            val share_middleincome: ShareMiddleincome,
            val size: Int,
            val students_with_pell_grant: Double,
            val undergrads_non_degree_seeking: Int,
            val undergrads_with_pell_grant_or_federal_student_loan: Int,
            val valid_dependency_status: Int
        ) {
            data class AvgDependentIncome(
                val `2014dollars`: Int
            )

            data class AvgIndependentIncome(
                val `2014dollars`: Int
            )

            data class Demographics(
                val age_entry: Int,
                val age_entry_squared: Any,
                val avg_family_income: Int,
                val avg_family_income_independents: Int,
                val avg_family_income_independents_log: Any,
                val avg_family_income_log: Any,
                val dependent: Double,
                val female_share: Double,
                val first_generation: Double,
                val married: Double,
                val median_family_income: Int,
                val median_hh_income: Int,
                val median_hh_income_log: Int,
                val men: Double,
                val non_resident_aliens_2000: Any,
                val over_23_at_entry: Double,
                val poverty_rate: Double,
                val race_ethnicity: RaceEthnicity,
                val share_asian: ShareAsian,
                val share_bachelors_degree_age25: ShareBachelorsDegreeAge25,
                val share_black: ShareBlack,
                val share_born_US: ShareBornUS,
                val share_hispanic: ShareHispanic,
                val share_professional_degree_age25: ShareProfessionalDegreeAge25,
                val share_white: ShareWhite,
                val unemployment: Double,
                val veteran: Double,
                val women: Double
            ) {
                data class RaceEthnicity(
                    val aian: Double,
                    val aian_2000: Any,
                    val aian_prior_2009: Any,
                    val api_2000: Any,
                    val asian: Double,
                    val asian_pacific_islander: Any,
                    val black: Double,
                    val black_2000: Any,
                    val black_non_hispanic: Any,
                    val hispanic: Double,
                    val hispanic_2000: Any,
                    val hispanic_prior_2009: Any,
                    val nhpi: Double,
                    val non_resident_alien: Double,
                    val two_or_more: Double,
                    val unknown: Double,
                    val unknown_2000: Any,
                    val white: Double,
                    val white_2000: Any,
                    val white_non_hispanic: Any
                )

                data class ShareAsian(
                    val home_ZIP: Double
                )

                data class ShareBachelorsDegreeAge25(
                    val home_ZIP: Double
                )

                data class ShareBlack(
                    val home_ZIP: Double
                )

                data class ShareBornUS(
                    val home_ZIP: Double
                )

                data class ShareHispanic(
                    val home_ZIP: Double
                )

                data class ShareProfessionalDegreeAge25(
                    val home_ZIP: Double
                )

                data class ShareWhite(
                    val home_ZIP: Double
                )
            }

            data class Enrollment(
                val all: Any,
                val grad_12_month: Int,
                val undergrad_12_month: Int
            )

            data class FafsaSent(
                val `1_college`: Any,
                val `2_college_allyrs`: Double,
                val `2_colleges`: Any,
                val `3_college`: Any,
                val `3_college_allyrs`: Double,
                val `4_college_allyrs`: Double,
                val `4_colleges`: Any,
                val `5_or_more_colleges`: Any,
                val `5plus_college_allyrs`: Double,
                val overall: Any
            )

            data class FamilyIncome(
                val dependent_students: Int,
                val independent_students: Int,
                val overall: Int
            )

            data class RetentionRate(
                val cohort: Cohort,
                val four_year: FourYear,
                val lt_four_year: LtFourYear,
                val overall: Overall,
                val pooled_yrs_used: PooledYrsUsed
            ) {
                data class Cohort(
                    val four_year: FourYear,
                    val lt_four_year: LtFourYear
                ) {
                    data class FourYear(
                        val full_time_pooled: Int,
                        val part_time_pooled: Int
                    )

                    data class LtFourYear(
                        val full_time_pooled: Any,
                        val part_time_pooled: Any
                    )
                }

                data class FourYear(
                    val full_time: Double,
                    val full_time_pooled: Double,
                    val part_time: Double,
                    val part_time_pooled: Double
                )

                data class LtFourYear(
                    val full_time: Any,
                    val full_time_pooled: Any,
                    val part_time: Any,
                    val part_time_pooled: Any
                )

                data class Overall(
                    val full_time: Double
                )

                data class PooledYrsUsed(
                    val full_time: Int,
                    val part_time: Int
                )
            }

            data class RetentionRateSuppressed(
                val four_year: FourYear,
                val lt_four_year: LtFourYear
            ) {
                data class FourYear(
                    val full_time_pooled: Double,
                    val part_time_pooled: Double
                )

                data class LtFourYear(
                    val full_time_pooled: Any,
                    val part_time_pooled: Any
                )
            }

            data class ShareDependentHighincome(
                val `110001plus`: Any,
                val `75001_110000`: Any
            )

            data class ShareDependentLowincome(
                val `0_300000`: Double
            )

            data class ShareDependentMiddleincome(
                val `300001_48000`: Double,
                val `48001_75000`: Any
            )

            data class ShareFirst(
                val time_full: TimeFull
            ) {
                data class TimeFull(
                    val time: Double
                )
            }

            data class ShareFirstgenerationParents(
                val highschool: Double,
                val middleschool: Double,
                val somecollege: Double
            )

            data class ShareHighincome(
                val `110001plus`: Double,
                val `75001_110000`: Double
            )

            data class ShareIndependentHighincome(
                val `110001plus`: Any,
                val `75001_110000`: Any
            )

            data class ShareIndependentLowincome(
                val `0_30000`: Double
            )

            data class ShareIndependentMiddleincome(
                val `30001_48000`: Double,
                val `48001_75000`: Any
            )

            data class ShareLowincome(
                val `0_30000`: Double
            )

            data class ShareMiddleincome(
                val `30001_48000`: Double,
                val `48001_75000`: Double
            )
        }
    }

    data class Location(
        val lat: Double,
        val lon: Double
    )

    data class School(
        val accreditor: String,
        val accreditor_code: String,
        val alias: String,
        val branches: Int,
        val carnegie_basic: Int,
        val carnegie_size_setting: Int,
        val carnegie_undergrad: Int,
        val city: String,
        val degree_urbanization: Any,
        val degrees_awarded: DegreesAwarded,
        val faculty_salary: Int,
        val ft_faculty_rate: Double,
        val institutional_characteristics: InstitutionalCharacteristics,
        val instructional_expenditure_per_fte: Int,
        val locale: Int,
        val main_campus: Int,
        val men_only: Int,
        val minority_serving: MinorityServing,
        val name: String,
        val online_only: Int,
        val open_admissions_policy: Int,
        val operating: Int,
        val ownership: Int,
        val ownership_peps: Int,
        val price_calculator_url: String,
        val region_id: Int,
        val religious_affiliation: Any,
        val school_url: String,
        val search: String,
        val state: String,
        val state_fips: Int,
        val title_iv: TitleIv,
        val tuition_revenue_per_fte: Int,
        val under_investigation: Int,
        val women_only: Int,
        val zip: String
    ) {
        data class DegreesAwarded(
            val highest: Int,
            val predominant: Int,
            val predominant_recoded: Int
        )

        data class InstitutionalCharacteristics(
            val level: Int
        )

        data class MinorityServing(
            val aanipi: Int,
            val annh: Int,
            val hispanic: Int,
            val historically_black: Int,
            val nant: Int,
            val predominantly_black: Int,
            val tribal: Int
        )

        data class TitleIv(
            val approval_date: String,
            val eligibility_type: Int
        )
    }
}

