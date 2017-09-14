/**
 */
package course_desc.impl;

import course_desc.Course_descPackage;
import course_desc.DeadlineEvaluation;
import course_desc.EvaluationWithDeadline;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evaluation With Deadline</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link course_desc.impl.EvaluationWithDeadlineImpl#getDeadlineEvaluation <em>Deadline Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvaluationWithDeadlineImpl extends EvaluationImpl implements EvaluationWithDeadline {
	/**
	 * The default value of the '{@link #getDeadlineEvaluation() <em>Deadline Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineEvaluation()
	 * @generated
	 * @ordered
	 */
	protected static final DeadlineEvaluation DEADLINE_EVALUATION_EDEFAULT = DeadlineEvaluation.ASSIGNMENT;

	/**
	 * The cached value of the '{@link #getDeadlineEvaluation() <em>Deadline Evaluation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadlineEvaluation()
	 * @generated
	 * @ordered
	 */
	protected DeadlineEvaluation deadlineEvaluation = DEADLINE_EVALUATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvaluationWithDeadlineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Course_descPackage.Literals.EVALUATION_WITH_DEADLINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeadlineEvaluation getDeadlineEvaluation() {
		return deadlineEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadlineEvaluation(DeadlineEvaluation newDeadlineEvaluation) {
		DeadlineEvaluation oldDeadlineEvaluation = deadlineEvaluation;
		deadlineEvaluation = newDeadlineEvaluation == null ? DEADLINE_EVALUATION_EDEFAULT : newDeadlineEvaluation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Course_descPackage.EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION, oldDeadlineEvaluation, deadlineEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Course_descPackage.EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION:
				return getDeadlineEvaluation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Course_descPackage.EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION:
				setDeadlineEvaluation((DeadlineEvaluation)newValue);
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
			case Course_descPackage.EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION:
				setDeadlineEvaluation(DEADLINE_EVALUATION_EDEFAULT);
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
			case Course_descPackage.EVALUATION_WITH_DEADLINE__DEADLINE_EVALUATION:
				return deadlineEvaluation != DEADLINE_EVALUATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deadlineEvaluation: ");
		result.append(deadlineEvaluation);
		result.append(')');
		return result.toString();
	}

} //EvaluationWithDeadlineImpl
