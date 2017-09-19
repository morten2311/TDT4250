/**
 */
package course_desc.impl;

import course_desc.Course_descPackage;
import course_desc.Exam;
import course_desc.Student;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Student</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.StudentImpl#getHasExams <em>Has Exams</em>}</li>
 *   <li>{@link course_desc.impl.StudentImpl#getFinishedExams <em>Finished Exams</em>}</li>
 *   <li>{@link course_desc.impl.StudentImpl#getTotalStudyPoints <em>Total Study Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StudentImpl extends PersonRoleImpl implements Student {
	/**
	 * The cached value of the '{@link #getHasExams() <em>Has Exams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasExams()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam> hasExams;

	/**
	 * The cached value of the '{@link #getFinishedExams() <em>Finished Exams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinishedExams()
	 * @generated
	 * @ordered
	 */
	protected EList<Exam> finishedExams;
	/**
	 * The cached setting delegate for the '{@link #getTotalStudyPoints() <em>Total Study Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalStudyPoints()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TOTAL_STUDY_POINTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)Course_descPackage.Literals.STUDENT__TOTAL_STUDY_POINTS).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StudentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.STUDENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam> getHasExams() {
		if (hasExams == null) {
			hasExams = new EObjectWithInverseResolvingEList.ManyInverse<Exam>(Exam.class, this, Course_descPackage.STUDENT__HAS_EXAMS, Course_descPackage.EXAM__HAS_REGISTERED_STUDENTS);
		}
		return hasExams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Exam> getFinishedExams() {
		if (finishedExams == null) {
			finishedExams = new EObjectResolvingEList<Exam>(Exam.class, this, Course_descPackage.STUDENT__FINISHED_EXAMS);
		}
		return finishedExams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalStudyPoints() {
		return (Double)TOTAL_STUDY_POINTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalStudyPoints(double newTotalStudyPoints) {
		TOTAL_STUDY_POINTS__ESETTING_DELEGATE.dynamicSet(this, null, 0, newTotalStudyPoints);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean signUpForExam(Exam exam) {
		if(!getHasExams().contains(exam)) {
			getHasExams().add(exam);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean cancelExam(Exam exam) {
		if(getHasExams().contains(exam)) {
			getHasExams().remove(exam);
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean takeExam(Exam exam) {
		if(getHasExams().contains(exam)) {
			getFinishedExams().add(exam);
			getHasExams().remove(exam);
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.STUDENT__HAS_EXAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getHasExams()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Course_descPackage.STUDENT__HAS_EXAMS:
				return ((InternalEList<?>)getHasExams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.STUDENT__HAS_EXAMS:
				return getHasExams();
			case Course_descPackage.STUDENT__FINISHED_EXAMS:
				return getFinishedExams();
			case Course_descPackage.STUDENT__TOTAL_STUDY_POINTS:
				return getTotalStudyPoints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.STUDENT__HAS_EXAMS:
				getHasExams().clear();
				getHasExams().addAll((Collection<? extends Exam>)newValue);
				return;
			case Course_descPackage.STUDENT__FINISHED_EXAMS:
				getFinishedExams().clear();
				getFinishedExams().addAll((Collection<? extends Exam>)newValue);
				return;
			case Course_descPackage.STUDENT__TOTAL_STUDY_POINTS:
				setTotalStudyPoints((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Course_descPackage.STUDENT__HAS_EXAMS:
				getHasExams().clear();
				return;
			case Course_descPackage.STUDENT__FINISHED_EXAMS:
				getFinishedExams().clear();
				return;
			case Course_descPackage.STUDENT__TOTAL_STUDY_POINTS:
				TOTAL_STUDY_POINTS__ESETTING_DELEGATE.dynamicUnset(this, null, 0);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Course_descPackage.STUDENT__HAS_EXAMS:
				return hasExams != null && !hasExams.isEmpty();
			case Course_descPackage.STUDENT__FINISHED_EXAMS:
				return finishedExams != null && !finishedExams.isEmpty();
			case Course_descPackage.STUDENT__TOTAL_STUDY_POINTS:
				return TOTAL_STUDY_POINTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Course_descPackage.STUDENT___SIGN_UP_FOR_EXAM__EXAM:
				return signUpForExam((Exam)arguments.get(0));
			case Course_descPackage.STUDENT___CANCEL_EXAM__EXAM:
				return cancelExam((Exam)arguments.get(0));
			case Course_descPackage.STUDENT___TAKE_EXAM__EXAM:
				return takeExam((Exam)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //StudentImpl
