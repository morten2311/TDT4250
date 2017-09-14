/**
 */
package course_desc.impl;

import course_desc.Course;
import course_desc.CourseCoordinator;
import course_desc.CourseInstance;
import course_desc.CoursePreconditions;
import course_desc.CourseWork;
import course_desc.CourseWorkType;
import course_desc.Course_descFactory;
import course_desc.Course_descPackage;
import course_desc.DeadlineEvaluation;
import course_desc.Department;
import course_desc.Evaluation;
import course_desc.EvaluationWithDeadline;
import course_desc.Exam;
import course_desc.Lecturer;
import course_desc.Person;
import course_desc.PersonRole;
import course_desc.Role;
import course_desc.Student;
import course_desc.StudyProgram;
import course_desc.StudyProgramCode;
import course_desc.Timetable;
import course_desc.Univ;

import course_desc.util.Course_descValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Course_descPackageImpl extends EPackageImpl implements Course_descPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass departmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timetableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursePreconditionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studyProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass univEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evaluationWithDeadlineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass studentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lecturerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseCoordinatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum courseWorkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum studyProgramCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum roleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deadlineEvaluationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see course_desc.Course_descPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Course_descPackageImpl() {
		super(eNS_URI, Course_descFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Course_descPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Course_descPackage init() {
		if (isInited) return (Course_descPackage)EPackage.Registry.INSTANCE.getEPackage(Course_descPackage.eNS_URI);

		// Obtain or create and register package
		Course_descPackageImpl theCourse_descPackage = (Course_descPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Course_descPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Course_descPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCourse_descPackage.createPackageContents();

		// Initialize created meta-data
		theCourse_descPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCourse_descPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Course_descValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCourse_descPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Course_descPackage.eNS_URI, theCourse_descPackage);
		return theCourse_descPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourse() {
		return courseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Code() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Name() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Content() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourse_Credits() {
		return (EAttribute)courseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_HasInstance() {
		return (EReference)courseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourse_HasPrecondition() {
		return (EReference)courseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseInstance() {
		return courseInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_HasTimetable() {
		return (EReference)courseInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_InstanceOfCourse() {
		return (EReference)courseInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_HasEvaluations() {
		return (EReference)courseInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseInstance_Year() {
		return (EAttribute)courseInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseInstance_LectureHours() {
		return (EAttribute)courseInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseInstance_LabHours() {
		return (EAttribute)courseInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_IsInstanceOf() {
		return (EReference)courseInstanceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstance_HasPersonRole() {
		return (EReference)courseInstanceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDepartment() {
		return departmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Responsible() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDepartment_Name() {
		return (EAttribute)departmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDepartment_Manages() {
		return (EReference)departmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Date() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Place() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Duration() {
		return (EAttribute)examEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_HasRegisteredStudents() {
		return (EReference)examEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimetable() {
		return timetableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_HasCourseWork() {
		return (EReference)timetableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimetable_Programs() {
		return (EReference)timetableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerson() {
		return personEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_PersonNr() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPerson_Name() {
		return (EAttribute)personEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPerson_HasRole() {
		return (EReference)personEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoursePreconditions() {
		return coursePreconditionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoursePreconditions_IsRequired() {
		return (EAttribute)coursePreconditionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoursePreconditions_ReductionPoints() {
		return (EAttribute)coursePreconditionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoursePreconditions_IsRecommended() {
		return (EAttribute)coursePreconditionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoursePreconditions_BelongsTo() {
		return (EReference)coursePreconditionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseWork() {
		return courseWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWork_Duration() {
		return (EAttribute)courseWorkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWork_Room() {
		return (EAttribute)courseWorkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWork_IsMandatory() {
		return (EAttribute)courseWorkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWork_IsRestricted() {
		return (EAttribute)courseWorkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourseWork_Type() {
		return (EAttribute)courseWorkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudyProgram() {
		return studyProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStudyProgram_StudyCode() {
		return (EAttribute)studyProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyProgram_Offers() {
		return (EReference)studyProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudyProgram_Belongs() {
		return (EReference)studyProgramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluation() {
		return evaluationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluation_Percentage() {
		return (EAttribute)evaluationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvaluation_BelongsTo() {
		return (EReference)evaluationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonRole() {
		return personRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRole_LinkedTo() {
		return (EReference)personRoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonRole_BelongsTo() {
		return (EReference)personRoleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUniv() {
		return univEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniv_HasDepartment() {
		return (EReference)univEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniv_HasCourses() {
		return (EReference)univEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniv_HasPersons() {
		return (EReference)univEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUniv_HasPrecond() {
		return (EReference)univEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvaluationWithDeadline() {
		return evaluationWithDeadlineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvaluationWithDeadline_DeadlineEvaluation() {
		return (EAttribute)evaluationWithDeadlineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStudent() {
		return studentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStudent_HasExams() {
		return (EReference)studentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStudent__SignUpForExam__Exam() {
		return studentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStudent__CancelExam() {
		return studentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStudent__TakeExam() {
		return studentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLecturer() {
		return lecturerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseCoordinator() {
		return courseCoordinatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCourseWorkType() {
		return courseWorkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStudyProgramCode() {
		return studyProgramCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRole() {
		return roleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDeadlineEvaluation() {
		return deadlineEvaluationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Course_descFactory getCourse_descFactory() {
		return (Course_descFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		courseEClass = createEClass(COURSE);
		createEAttribute(courseEClass, COURSE__CODE);
		createEAttribute(courseEClass, COURSE__NAME);
		createEAttribute(courseEClass, COURSE__CONTENT);
		createEAttribute(courseEClass, COURSE__CREDITS);
		createEReference(courseEClass, COURSE__HAS_INSTANCE);
		createEReference(courseEClass, COURSE__HAS_PRECONDITION);

		courseInstanceEClass = createEClass(COURSE_INSTANCE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__HAS_TIMETABLE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__INSTANCE_OF_COURSE);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__HAS_EVALUATIONS);
		createEAttribute(courseInstanceEClass, COURSE_INSTANCE__YEAR);
		createEAttribute(courseInstanceEClass, COURSE_INSTANCE__LECTURE_HOURS);
		createEAttribute(courseInstanceEClass, COURSE_INSTANCE__LAB_HOURS);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__IS_INSTANCE_OF);
		createEReference(courseInstanceEClass, COURSE_INSTANCE__HAS_PERSON_ROLE);

		departmentEClass = createEClass(DEPARTMENT);
		createEReference(departmentEClass, DEPARTMENT__RESPONSIBLE);
		createEAttribute(departmentEClass, DEPARTMENT__NAME);
		createEReference(departmentEClass, DEPARTMENT__MANAGES);

		examEClass = createEClass(EXAM);
		createEAttribute(examEClass, EXAM__DATE);
		createEAttribute(examEClass, EXAM__PLACE);
		createEAttribute(examEClass, EXAM__DURATION);
		createEReference(examEClass, EXAM__HAS_REGISTERED_STUDENTS);

		timetableEClass = createEClass(TIMETABLE);
		createEReference(timetableEClass, TIMETABLE__HAS_COURSE_WORK);
		createEReference(timetableEClass, TIMETABLE__PROGRAMS);

		personEClass = createEClass(PERSON);
		createEAttribute(personEClass, PERSON__PERSON_NR);
		createEAttribute(personEClass, PERSON__NAME);
		createEReference(personEClass, PERSON__HAS_ROLE);

		coursePreconditionsEClass = createEClass(COURSE_PRECONDITIONS);
		createEAttribute(coursePreconditionsEClass, COURSE_PRECONDITIONS__IS_REQUIRED);
		createEAttribute(coursePreconditionsEClass, COURSE_PRECONDITIONS__REDUCTION_POINTS);
		createEAttribute(coursePreconditionsEClass, COURSE_PRECONDITIONS__IS_RECOMMENDED);
		createEReference(coursePreconditionsEClass, COURSE_PRECONDITIONS__BELONGS_TO);

		courseWorkEClass = createEClass(COURSE_WORK);
		createEAttribute(courseWorkEClass, COURSE_WORK__DURATION);
		createEAttribute(courseWorkEClass, COURSE_WORK__ROOM);
		createEAttribute(courseWorkEClass, COURSE_WORK__IS_MANDATORY);
		createEAttribute(courseWorkEClass, COURSE_WORK__IS_RESTRICTED);
		createEAttribute(courseWorkEClass, COURSE_WORK__TYPE);

		studyProgramEClass = createEClass(STUDY_PROGRAM);
		createEAttribute(studyProgramEClass, STUDY_PROGRAM__STUDY_CODE);
		createEReference(studyProgramEClass, STUDY_PROGRAM__OFFERS);
		createEReference(studyProgramEClass, STUDY_PROGRAM__BELONGS);

		evaluationEClass = createEClass(EVALUATION);
		createEAttribute(evaluationEClass, EVALUATION__PERCENTAGE);
		createEReference(evaluationEClass, EVALUATION__BELONGS_TO);

		personRoleEClass = createEClass(PERSON_ROLE);
		createEReference(personRoleEClass, PERSON_ROLE__LINKED_TO);
		createEReference(personRoleEClass, PERSON_ROLE__BELONGS_TO);

		univEClass = createEClass(UNIV);
		createEReference(univEClass, UNIV__HAS_DEPARTMENT);
		createEReference(univEClass, UNIV__HAS_COURSES);
		createEReference(univEClass, UNIV__HAS_PERSONS);
		createEReference(univEClass, UNIV__HAS_PRECOND);

		evaluationWithDeadlineEClass = createEClass(EVALUATION_WITH_DEADLINE);
		createEAttribute(evaluationWithDeadlineEClass, EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION);

		studentEClass = createEClass(STUDENT);
		createEReference(studentEClass, STUDENT__HAS_EXAMS);
		createEOperation(studentEClass, STUDENT___SIGN_UP_FOR_EXAM__EXAM);
		createEOperation(studentEClass, STUDENT___CANCEL_EXAM);
		createEOperation(studentEClass, STUDENT___TAKE_EXAM);

		lecturerEClass = createEClass(LECTURER);

		courseCoordinatorEClass = createEClass(COURSE_COORDINATOR);

		// Create enums
		courseWorkTypeEEnum = createEEnum(COURSE_WORK_TYPE);
		studyProgramCodeEEnum = createEEnum(STUDY_PROGRAM_CODE);
		roleEEnum = createEEnum(ROLE);
		deadlineEvaluationEEnum = createEEnum(DEADLINE_EVALUATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		examEClass.getESuperTypes().add(this.getEvaluation());
		evaluationWithDeadlineEClass.getESuperTypes().add(this.getEvaluation());
		studentEClass.getESuperTypes().add(this.getPersonRole());
		lecturerEClass.getESuperTypes().add(this.getPersonRole());
		courseCoordinatorEClass.getESuperTypes().add(this.getPersonRole());

		// Initialize classes, features, and operations; add parameters
		initEClass(courseEClass, Course.class, "Course", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourse_Code(), ecorePackage.getEString(), "Code", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Name(), ecorePackage.getEString(), "name", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Content(), ecorePackage.getEString(), "Content", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourse_Credits(), ecorePackage.getEDoubleObject(), "Credits", null, 0, 1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_HasInstance(), this.getCourseInstance(), this.getCourseInstance_InstanceOfCourse(), "hasInstance", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourse_HasPrecondition(), this.getCoursePreconditions(), null, "hasPrecondition", null, 0, -1, Course.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseInstanceEClass, CourseInstance.class, "CourseInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseInstance_HasTimetable(), this.getTimetable(), null, "hasTimetable", null, 1, -1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_InstanceOfCourse(), this.getCourse(), this.getCourse_HasInstance(), "instanceOfCourse", null, 1, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_HasEvaluations(), this.getEvaluation(), this.getEvaluation_BelongsTo(), "hasEvaluations", null, 1, -1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseInstance_Year(), ecorePackage.getEInt(), "Year", null, 0, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseInstance_LectureHours(), ecorePackage.getEDouble(), "LectureHours", null, 0, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseInstance_LabHours(), ecorePackage.getEDouble(), "LabHours", null, 0, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_IsInstanceOf(), this.getDepartment(), this.getDepartment_Responsible(), "isInstanceOf", null, 1, 1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstance_HasPersonRole(), this.getPersonRole(), this.getPersonRole_BelongsTo(), "hasPersonRole", null, 0, -1, CourseInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(departmentEClass, Department.class, "Department", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDepartment_Responsible(), this.getCourseInstance(), this.getCourseInstance_IsInstanceOf(), "responsible", null, 0, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDepartment_Name(), ecorePackage.getEString(), "name", null, 0, 1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDepartment_Manages(), this.getStudyProgram(), this.getStudyProgram_Belongs(), "manages", null, 1, -1, Department.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExam_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Place(), ecorePackage.getEString(), "place", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Duration(), ecorePackage.getEDouble(), "duration", null, 0, 1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExam_HasRegisteredStudents(), this.getStudent(), this.getStudent_HasExams(), "hasRegisteredStudents", null, 0, -1, Exam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timetableEClass, Timetable.class, "Timetable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimetable_HasCourseWork(), this.getCourseWork(), null, "hasCourseWork", null, 0, -1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimetable_Programs(), this.getStudyProgram(), null, "programs", null, 0, -1, Timetable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personEClass, Person.class, "Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPerson_PersonNr(), ecorePackage.getEBigInteger(), "personNr", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPerson_Name(), ecorePackage.getEString(), "name", null, 0, 1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPerson_HasRole(), this.getPersonRole(), this.getPersonRole_LinkedTo(), "hasRole", null, 0, -1, Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coursePreconditionsEClass, CoursePreconditions.class, "CoursePreconditions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoursePreconditions_IsRequired(), ecorePackage.getEBoolean(), "isRequired", null, 0, 1, CoursePreconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoursePreconditions_ReductionPoints(), ecorePackage.getEDouble(), "reductionPoints", null, 0, 1, CoursePreconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCoursePreconditions_IsRecommended(), ecorePackage.getEBoolean(), "isRecommended", null, 0, 1, CoursePreconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCoursePreconditions_BelongsTo(), this.getCourse(), null, "belongsTo", null, 1, 1, CoursePreconditions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseWorkEClass, CourseWork.class, "CourseWork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCourseWork_Duration(), ecorePackage.getEInt(), "Duration", null, 0, 1, CourseWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWork_Room(), ecorePackage.getEString(), "Room", null, 0, 1, CourseWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWork_IsMandatory(), ecorePackage.getEBoolean(), "isMandatory", null, 0, 1, CourseWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWork_IsRestricted(), ecorePackage.getEBoolean(), "isRestricted", null, 0, 1, CourseWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourseWork_Type(), this.getCourseWorkType(), "Type", null, 0, 1, CourseWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studyProgramEClass, StudyProgram.class, "StudyProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStudyProgram_StudyCode(), this.getStudyProgramCode(), "studyCode", null, 0, 1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyProgram_Offers(), this.getCourse(), null, "offers", null, 0, -1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStudyProgram_Belongs(), this.getDepartment(), this.getDepartment_Manages(), "belongs", null, 1, 1, StudyProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationEClass, Evaluation.class, "Evaluation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluation_Percentage(), ecorePackage.getEDouble(), "Percentage", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvaluation_BelongsTo(), this.getCourseInstance(), this.getCourseInstance_HasEvaluations(), "belongsTo", null, 0, 1, Evaluation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personRoleEClass, PersonRole.class, "PersonRole", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonRole_LinkedTo(), this.getPerson(), this.getPerson_HasRole(), "linkedTo", null, 0, 1, PersonRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonRole_BelongsTo(), this.getCourseInstance(), this.getCourseInstance_HasPersonRole(), "belongsTo", null, 0, 1, PersonRole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(univEClass, Univ.class, "Univ", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniv_HasDepartment(), this.getDepartment(), null, "hasDepartment", null, 0, -1, Univ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniv_HasCourses(), this.getCourse(), null, "hasCourses", null, 0, -1, Univ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniv_HasPersons(), this.getPerson(), null, "hasPersons", null, 0, -1, Univ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniv_HasPrecond(), this.getCoursePreconditions(), null, "hasPrecond", null, 0, -1, Univ.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evaluationWithDeadlineEClass, EvaluationWithDeadline.class, "EvaluationWithDeadline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvaluationWithDeadline_DeadlineEvaluation(), this.getDeadlineEvaluation(), "deadlineEvaluation", null, 0, 1, EvaluationWithDeadline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(studentEClass, Student.class, "Student", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStudent_HasExams(), this.getExam(), this.getExam_HasRegisteredStudents(), "hasExams", null, 0, -1, Student.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getStudent__SignUpForExam__Exam(), null, "signUpForExam", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getExam(), "exam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStudent__CancelExam(), null, "cancelExam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStudent__TakeExam(), null, "takeExam", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lecturerEClass, Lecturer.class, "Lecturer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(courseCoordinatorEClass, CourseCoordinator.class, "CourseCoordinator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(courseWorkTypeEEnum, CourseWorkType.class, "CourseWorkType");
		addEEnumLiteral(courseWorkTypeEEnum, CourseWorkType.LABHOUR);
		addEEnumLiteral(courseWorkTypeEEnum, CourseWorkType.LECTURE);

		initEEnum(studyProgramCodeEEnum, StudyProgramCode.class, "StudyProgramCode");
		addEEnumLiteral(studyProgramCodeEEnum, StudyProgramCode.MTDT);
		addEEnumLiteral(studyProgramCodeEEnum, StudyProgramCode.BIT);
		addEEnumLiteral(studyProgramCodeEEnum, StudyProgramCode.MIT);
		addEEnumLiteral(studyProgramCodeEEnum, StudyProgramCode.MTIØT);

		initEEnum(roleEEnum, Role.class, "Role");
		addEEnumLiteral(roleEEnum, Role.LECTURER);
		addEEnumLiteral(roleEEnum, Role.STUDENT);
		addEEnumLiteral(roleEEnum, Role.COURSE_COORDINATOR);

		initEEnum(deadlineEvaluationEEnum, DeadlineEvaluation.class, "DeadlineEvaluation");
		addEEnumLiteral(deadlineEvaluationEEnum, DeadlineEvaluation.ASSIGNMENT);
		addEEnumLiteral(deadlineEvaluationEEnum, DeadlineEvaluation.PROJECT);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL
		createOCLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "validationDelegate", "http://www.eclipse.org/emf/2002/Ecore/OCL"
		   });	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "constraints", "onlyLetters onlyElevenNumbers"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL";	
		addAnnotation
		  (personEClass, 
		   source, 
		   new String[] {
			 "onlyElevenNumbers", "self.personNr.toString().size() = 11"
		   });
	}

} //Course_descPackageImpl
